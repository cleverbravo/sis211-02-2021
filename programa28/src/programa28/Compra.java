package programa28;

import java.util.*;
public class Compra {
    private Cliente cliente;
    private ArrayList<Producto> carrito=new ArrayList();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }
    public int getTotal(){
        int total=0;
        for(Producto p:carrito)
            total+=p.getPrecio();
        return total;
    }
}
