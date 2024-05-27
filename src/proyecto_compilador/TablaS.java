package proyecto_compilador;

public class TablaS 
{
    public String[][] dato;
    TablaS siguiente, anterior, function, procedure;
    
    // Constructor para cuando no hay nodos
    public TablaS(String[][] elemento)
    {
        this(elemento, null, null, null, null);
    }
    
    // Constructor para cuando ya hay nodos
    public TablaS(String[][] elemento, TablaS ant, TablaS sig, TablaS fun, TablaS pro)
    {
        dato = elemento;
        anterior = ant;
        siguiente = sig;
        function = fun;
        procedure = pro;
    }
}