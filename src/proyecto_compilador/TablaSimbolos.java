package proyecto_compilador;

import java.util.Arrays;

enum Contexto 
{
    PRINCIPAL,
    FUNCTION,
    PROCEDURE
}

public class TablaSimbolos 
{
    TablaS inicio;
    TablaS fin;
    Contexto contexto;
    TablaS tablaFun;
    TablaS tablaPro;
    
    public TablaSimbolos() 
    {
        inicio = null;
        fin = null;
        contexto = Contexto.PRINCIPAL;
        tablaFun = null;
        tablaPro = null;
    }
    
    public TablaS referenciaFun()
    {
        return tablaFun;
    }
    
    public TablaS referenciaPro()
    {
        return tablaPro;
    }

    public void agregarSimbolo(String[] simbolo) 
    {
        switch(contexto) {
            case PRINCIPAL:
                if(inicio != null)
                    agregarSimboloATabla(inicio, simbolo);
                else {
                    inicio = new TablaS(new String[][]{simbolo});
                    fin = inicio;
                }
                break;
            case FUNCTION:
                if(tablaFun != null)
                    agregarSimboloATabla(tablaFun, simbolo);
                else
                    tablaFun = new TablaS(new String[][]{simbolo});                
                break;
            case PROCEDURE:
                if(tablaPro != null)
                    agregarSimboloATabla(tablaPro, simbolo);
                else
                    tablaPro = new TablaS(new String[][]{simbolo});                
                break;
        }
    }

    private void agregarSimboloATabla(TablaS tabla, String[] simbolo) 
    {
        String[][] nuevoDato = new String[tabla.dato.length + 1][];
        System.arraycopy(tabla.dato, 0, nuevoDato, 0, tabla.dato.length);
        nuevoDato[tabla.dato.length] = simbolo;
        tabla.dato = nuevoDato;
    }

    public void cambiarContexto(Contexto nuevoContexto) 
    {
        contexto = nuevoContexto;
    }

    public void finalizarContexto() 
    {
        switch(contexto) {
            case FUNCTION:
                inicio.function = tablaFun;
                tablaFun = null;
                break;
            case PROCEDURE:
                inicio.procedure = tablaPro;
                tablaPro = null;
                break;
        }
        contexto = Contexto.PRINCIPAL;
    }
    
    public boolean buscarSimbolo(String lexema)
    {
        if(inicio != null)
            for(String[] fila: inicio.dato)       
                if(fila[0].equals(lexema))
                    return true;
        return false;
    }
    
    public String buscarContexto(String lexema)
    {
        if(inicio != null)
            for(String[] fila: inicio.dato)       
                if(fila[0].equals(lexema))
                    return String.valueOf(fila[1]);
        return "";
    }

    public void imprimirTabla() 
    {
        TablaS actual = inicio;
        while (actual != null) {
            System.out.println("Tabla Principal:");
            for (String[] fila : actual.dato) {
                System.out.println(Arrays.toString(fila));
            }
            if (actual.function != null) {
                System.out.println("Funciones:");
                imprimirSubTabla(actual.function);
            }
            if (actual.procedure != null) {
                System.out.println("Procedimientos:");
                imprimirSubTabla(actual.procedure);
            }
            actual = actual.siguiente;
        }
    }

    private void imprimirSubTabla(TablaS subTabla) 
    {
        TablaS actual = subTabla;
        while (actual != null) {
            for (String[] fila : actual.dato)
                System.out.println(Arrays.toString(fila));
            actual = actual.siguiente;
        }
    }
}