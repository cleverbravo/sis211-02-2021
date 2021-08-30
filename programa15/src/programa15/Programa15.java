package programa15;

//import java.awt.Color;

public class Programa15 {
    public static void main(String[] args) {
        Chaqueta objeto=new Chaqueta();
        objeto.talla=5;
        Chaqueta ch=new Chaqueta();
        ch.talla=8;
        ch.color="Rojo";
        System.out.println("ch tiene color:"+ch.color);
        objeto.talla=ch.talla/2;
        System.out.println("objeto tiene talla:"+objeto.talla);
        objeto.precio=100;
        objeto.costo=150;
        System.out.println("ganancia del objeto es:"+objeto.ganancia());
    }
}

class Chaqueta{
    int talla;//atributo
    String color;//atributo
    String design;//atributo
    double precio,costo;//atributo
    double ganancia(){//metodo o funcion
        double g=costo-precio;
        return g;
    }
}

