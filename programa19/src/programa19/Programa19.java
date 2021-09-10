package programa19;
import java.util.*;
public class Programa19 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        D d=new D();
        a.leerDatos();
        System.out.println("mostrando a");
        a.mostrarDatos();
        d.leerDatos();
        System.out.println("mostrando d"); 
        d.mostrarDatos();
    }
}

class A{    
    double x;
    String y;
    public void leerDatos(){
        Scanner cin=new Scanner(System.in);
        System.out.println(this.getClass().getTypeName());
        if(this.getClass().getTypeName().compareTo("programa19.A")==0)
            System.out.println("esto quiero que se muestre solo desde la clase A");
        
        System.out.println("introduzca un numero real:");
        x=cin.nextDouble();
        System.out.println("introduzca una palabra:");
        y=cin.next();
    }
    public void mostrarDatos(){
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
class B extends A{
    double b;
    public void leerDatos(){
        super.leerDatos();
        Scanner cin=new Scanner(System.in);
        System.out.println("introduzca un numero real:");
        b=cin.nextDouble();
    }
}
class C extends A{
    boolean c;
    public void leerDatos(){
        super.leerDatos();
        Scanner cin=new Scanner(System.in);
        System.out.println("introduzca un booleano:");
        c=cin.nextBoolean();
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("c="+c);
    }
}
class D extends C{
    
}
