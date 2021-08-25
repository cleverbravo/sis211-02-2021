package programa2;

public class Programa2 {
    public static void hola(){
        System.out.println("hola desde la funcion");
    }
    public static void adios(){
        System.out.println("adios desde la funcion");
    }
    public static void main(String[] args) {
        System.out.println("hola desde main");
        hola();
        adios();
        System.out.println("adios desde main");
    }
}
