package programa17;

import java.util.*;
public class Programa17 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        ArrayList<Persona> personas=new ArrayList();
        do{
            System.out.println("1.registrar persona");
            System.out.println("2.listar personas");
            System.out.println("3.salir");
            int op=cin.nextInt();
            switch(op){
                case 1:
                    Persona p=new Persona();
                    p.leerDatos();
                    personas.add(p);
                    break;
                case 2:
                    for(Persona p1:personas){
                            p1.mostrarDatos();
                    }
                    break;
            }
        }while(true);
    }
}

class Persona{
    String nombre;
    double monto;
    public void leerDatos(){
        Scanner cin=new Scanner(System.in);
        System.out.println("introduzca el nombre de la persona");
        nombre=cin.next();
        System.out.println("introduzca el monto donado");
        monto=cin.nextDouble();
    }
    public void mostrarDatos(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Monto:"+monto);
    }
}
