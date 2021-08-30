package programa16;
/*
Escribir un programa, para registrar una lista de donantes de sangre.
*/
import java.util.*;
public class Programa16 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        ArrayList<Persona> personas=new ArrayList();
        do{
            System.out.println("1.Registrar persona");
            System.out.println("2.Mostrar la lista de donantes");
            System.out.println("3.Salir");
            int op=cin.nextInt();
            switch(op){
                case 1:{
                    Persona p=new Persona();
                    p.leerDatos();
                    personas.add(p);
                    break;
                }
                case 2:
                    System.out.println("mostrando la lista de donantes");
                    for(Persona p:personas){
                        p.mostrarDatos();
                    }
                    break;
                case 3:
                    System.out.println("Bye.");
                    System.exit(0);
                    break;
                default: System.out.println("Invalid option.");
            }
        }while(true);
    }
}
class Persona{
    String nombre,ci,tipoDeSangre;
    void leerDatos(){
        Scanner cin=new Scanner(System.in);
        System.out.println("Introduzca el nombre del donante:");
        nombre=cin.next();
        System.out.println("Introduzca el CI del donante:");
        ci=cin.next();
        System.out.println("Introduzca el tipo de sangre del donante:");
        tipoDeSangre=cin.next();
    }
    void mostrarDatos(){
        System.out.println("Donante "+nombre);
        System.out.println("CI: "+ci);
        System.out.println("Tipo: "+tipoDeSangre);
    }
}