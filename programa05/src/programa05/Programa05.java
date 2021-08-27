package programa05;
import java.util.*;
public class Programa05 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        int n=cin.nextInt();
        /*
        String message;
        if(n%2==0){
            message=" es par";
        }
        else{
            message=" no es par";
        }
        */
        String message= n%2==0?" es par":" no es par";
        System.out.println(n+message);
    }
}
