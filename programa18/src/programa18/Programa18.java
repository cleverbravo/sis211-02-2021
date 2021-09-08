package programa18;
import java.util.*;
public class Programa18 {
    public static void main(String[] args) {
        ArrayList<Producto> productos=new ArrayList();
        Scanner cin=new Scanner(System.in);
        do{
            System.out.println("1. Registrar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Salir");
            int op=cin.nextInt();
            switch(op){
                case 1:
                    Producto nuevo=new Producto();
                    nuevo.leerDatos();
                    productos.add(nuevo);
                    break;
                case 2:
                    for(Producto p:productos){
                        p.mostrarDatos();
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while(true);
    }
    
}

class Producto{
    String nombre;
    double precio, costo;
    public void leerDatos(){
        Scanner cin=new Scanner(System.in);
        System.out.println("introduzca el nombre del producto");
        nombre=cin.next();
        System.out.println("introduzca el precio");
        precio=cin.nextDouble();
        System.out.println("introduzca el costo");
        costo=cin.nextDouble();
    }
    public void mostrarDatos(){
        System.out.println("Producto:"+nombre);
        System.out.println("Precio:"+precio);
        System.out.println("Costo:"+costo);
    }
}