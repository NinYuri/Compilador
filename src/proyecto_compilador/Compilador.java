package proyecto_compilador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Compilador extends javax.swing.JFrame 
{
    NumeroLinea numerolinea;
    Directorio direc;
    String error = "";
    int con = 0;
    
    Stack<String> pilaaux = new Stack<>();
    Stack<String> pilaprin = new Stack<>();
    String tokens[] = {"id", "num", "litcar", "litcad", "(", ")", "+", "-", "*", "/", "%", "<", ">", "<=", ">=", "!=", "&&", "||", "!", "$"};
    String estados[] = {"L", "L'", "R", "R'", "E", "E'", "T", "T'", "F"};
    String[][] acciones = {
        {"R L'", "R L'", "R L'", "R L'", "R L'", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "! L", "sacar"},    //L
        {"saltar", "saltar", "saltar", "saltar", "saltar", "", "", "", "", "", "", "", "", "", "", "", "&& R L'", "|| R L'", "", ""},     //L'
        {"E R'", "E R'", "E R'", "E R'", "E R'", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "sacar"},       //R
        {"saltar", "saltar", "saltar", "saltar", "saltar", "", "", "", "", "", "", "< E", "> E", "<= E", ">= E", "!= E", "", "", "", ""},             //R'
        {"T E'", "T E'", "T E'", "T E'", "T E'", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "sacar"},       //E
        {"saltar", "saltar", "saltar", "saltar", "saltar", "", "+ T E'", "- T E'", "", "", "", "", "", "", "", "", "", "", "", ""},       //E'
        {"F T'", "F T'", "F T'", "F T'", "F T'", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "sacar"},       //T
        {"saltar", "saltar", "saltar", "saltar", "saltar", "", "", "", "* F T'", "/ F T'", "% F T'", "", "", "", "", "", "", "", "", ""},       //T'
        {"id", "num", "litcar", "litcad", "( L )", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "saltar", "sacar"}          //F
    };

    public Compilador() 
    {
        initComponents();
        inicializar();
        setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
        tabErrores.setVisible(false);
        lblCerrar.setVisible(false);
        lblSee.setVisible(false);               
    }
    
    public void Mostrar()
    {
        for(String elemento : pilaprin)
            jtaSintactico.append(elemento);
        jtaSintactico.append("\n");
    }
    
    public void restartError()
    {
        error = "";
        con = 0;
        Errores.setText("");
        tabErrores.setVisible(false);
        lblCerrar.setVisible(false);
        lblSee.setVisible(false);
    }
    
    public void restartPila()
    {
        pilaprin.clear();
        pilaaux.clear();
        pilaprin.push("$");
        pilaprin.push("L");               
    }
    
    public void Sintactico(String token, int linea) 
    {        
        int col = -1;
        int estado = 0;
        String accion[] = null;
        
        Mostrar();
        while(!pilaprin.isEmpty() && !pilaprin.peek().equals(token))
        {
            for(int i = 0; i < tokens.length; i++) {
                if(token.equals(tokens[i])) {
                    col = i;
                    break;
                }
            }
            
            String estadoActual = pilaprin.peek();
            for(int j = 0; j < estados.length; j++)
                if(String.valueOf(estados[j]).equals(estadoActual)) {
                    estado = j;
                    break;
                }

            if(acciones[estado][col].equals("") || acciones[estado][col].equals("sacar")) {              
                pilaprin.pop();
                Mostrar();                    
            }
            else
                if(acciones[estado][col].equals("saltar"))
                {                    
                    if(estados[estado].equals("L") || estados[estado].equals("R") || estados[estado].equals("E") || estados[estado].equals("T") || estados[estado].equals("F")) {
                        con++;
                        error += con + ". Error sintáctico en la línea " + linea + ": esperaba un operando" + "\n";                        
                    }
                    else if(estados[estado].equals("L'") || estados[estado].equals("R'") || estados[estado].equals("E'") || estados[estado].equals("T'")) {
                        con++;
                        error += con + ". Error sintáctico en la línea " + linea + ": esperaba un operador" + "\n";                         
                    }
                    break;
                }
                else {
                    accion = acciones[estado][col].split(" ");                          
                    for(int l = 0; l < accion.length; l++)
                        pilaaux.push(accion[l]);

                    pilaprin.pop();
                    while(!pilaaux.isEmpty())
                        pilaprin.push(pilaaux.pop());                                          

                    Mostrar();
                }            
        }
        
        if(pilaprin.peek().equals(token))
            pilaprin.pop(); // Concuerda
    }
    
    public void Lexico()
    {        
        boolean ban = true;
        Analisis c = new Analisis();
        File archivo = new File("Compilacion.yam"); // Representa el archivo Compilacion
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(jtpCode.getText());
            escribir.close();
        }
        catch(FileNotFoundException e) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            Reader lector = new BufferedReader(new FileReader("Compilacion.yam"));
            Lexer lexer = new Lexer(lector);
            String resLexico = "";
            
            while(ban) {
                Tokens token = lexer.yylex();
                if(token == null) {
                    resLexico += "$";
                    jtaLexico.setText(resLexico);
                    Sintactico("$", (c.linea + 1));
                    if(!error.isEmpty()) {
                        tabErrores.setVisible(true);
                        lblCerrar.setVisible(true);
                        Errores.setText("Hubo un total de " + con + " errores \n" + "\n" + error);
                        Errores.requestFocus();
                    }
                    ban = false;
                    return;
                }
                switch(token) {
                    case Error:
                        con++;
                        error += con + ". Error léxico en la línea " + (c.linea + 1) + " con el lexema " + lexer.lexeme + "\n";                        
                        break;
                    case program, idp, read, print, then, id, num, litcar, litcad:
                        resLexico += token + "\n";
                        Sintactico(String.valueOf(token), (c.linea + 1));
                        break;
                    default:
                        resLexico += lexer.lexeme + "\n";
                        Sintactico(String.valueOf(lexer.lexeme), (c.linea + 1));
                        break;
                }                                
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSee = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        tabErrores = new javax.swing.JScrollPane();
        Errores = new javax.swing.JTextArea();
        tabCode = new javax.swing.JScrollPane();
        jtpCode = new javax.swing.JTextPane();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnCompilar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaLexico = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtaSintactico = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSee.setBackground(new java.awt.Color(0, 0, 0));
        lblSee.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblSee.setForeground(new java.awt.Color(255, 255, 255));
        lblSee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSee.setText("Ver Errores");
        lblSee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSee.setOpaque(true);
        lblSee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSeeMouseClicked(evt);
            }
        });
        getContentPane().add(lblSee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 140, -1));

        lblCerrar.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1307, 697, 30, -1));

        Errores.setBackground(new java.awt.Color(0, 0, 0));
        Errores.setColumns(20);
        Errores.setForeground(new java.awt.Color(255, 255, 255));
        Errores.setRows(5);
        Errores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ERRORES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Light", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        tabErrores.setViewportView(Errores);

        getContentPane().add(tabErrores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 1340, 195));

        jtpCode.setBackground(new java.awt.Color(0, 0, 0));
        jtpCode.setForeground(new java.awt.Color(255, 255, 255));
        tabCode.setViewportView(jtpCode);

        getContentPane().add(tabCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 890, 610));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/icons8_save_48px.png"))); // NOI18N
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pressed/icons8_save_48px_p.png"))); // NOI18N
        btnGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/On Layer/icons8_save_48px_on.png"))); // NOI18N
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 40, 40));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/icons8_code_file_30px.png"))); // NOI18N
        btnNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pressed/icons8_code_file_48px_p.png"))); // NOI18N
        btnNuevo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/On Layer/icons8_code_file_48px_on.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 40));

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/icons8_opened_folder_48px.png"))); // NOI18N
        btnAbrir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pressed/icons8_opened_folder_48px_P.png"))); // NOI18N
        btnAbrir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/On Layer/icons8_opened_folder_48px_ON.png"))); // NOI18N
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 40, 40));

        btnCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Icon/icons8_code_30px.png"))); // NOI18N
        btnCompilar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pressed/icons8_code_48px_p.png"))); // NOI18N
        btnCompilar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/On Layer/icons8_code_48px_on.png"))); // NOI18N
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 40, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setText("Analizador Léxico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, -1, -1));

        jtaLexico.setBackground(new java.awt.Color(0, 0, 0));
        jtaLexico.setColumns(20);
        jtaLexico.setForeground(new java.awt.Color(255, 255, 255));
        jtaLexico.setRows(5);
        jScrollPane3.setViewportView(jtaLexico);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 90, 440, 170));

        jtaSintactico.setBackground(new java.awt.Color(0, 0, 0));
        jtaSintactico.setColumns(20);
        jtaSintactico.setForeground(new java.awt.Color(255, 255, 255));
        jtaSintactico.setRows(5);
        jScrollPane5.setViewportView(jtaSintactico);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 440, 380));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel4.setText("Analizador Sintáctico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        direc.Abrir(this);
        restartError();
        clearAllComp();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        direc.Nuevo(this);
        restartError();
        clearAllComp();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        direc.Guardar(this);
        restartError();
        clearAllComp();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        restartPila();
        restartError();
        direc.Guardar(this);
        clearAllComp();
        Lexico();
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        tabErrores.setVisible(false);
        lblCerrar.setVisible(false);
        lblSee.setVisible(true);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblSeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSeeMouseClicked
        lblSee.setVisible(false);
        tabErrores.setVisible(true);
        lblCerrar.setVisible(true);        
    }//GEN-LAST:event_lblSeeMouseClicked

    /**
     * @param args the command line arguments
     */
    
    private void inicializar()
    {
        setTitle("#YAMCompilador");
        String[] options = new String[] {"Guardar y continuar", "Descartar"};
        direc = new Directorio();
        
        //Para mostrar el numero de lineas en el panel
        numerolinea = new NumeroLinea(jtpCode);
        tabCode.setRowHeaderView(numerolinea);
    }
    
    public void clearAllComp()
    {
        jtaLexico.setText("");
        jtaSintactico.setText("");
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compilador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Errores;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jtaLexico;
    private javax.swing.JTextArea jtaSintactico;
    public javax.swing.JTextPane jtpCode;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblSee;
    private javax.swing.JScrollPane tabCode;
    private javax.swing.JScrollPane tabErrores;
    // End of variables declaration//GEN-END:variables
}
