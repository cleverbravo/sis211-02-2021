package programa28;

import java.util.*;
public class Datos {
    public static ArrayList<Producto> productos=new ArrayList();
    public static ArrayList<Cliente> clientes=new ArrayList();
    public static ArrayList<Compra> compras=new ArrayList();
    
    public static Producto buscarProducto(String nombre){
        nombre=nombre.toLowerCase();
        for(Producto p:productos)
            if(p.getNombre().toLowerCase().compareTo(nombre)==0)
                return p;
        return null;
    }
    public static Cliente buscarCliente(String nitCi){
        nitCi=nitCi.toLowerCase();
        for(Cliente c:clientes)
            if(c.getNitCi().toLowerCase().compareTo(nitCi)==0)
                return c;
        return null;
    }
}
