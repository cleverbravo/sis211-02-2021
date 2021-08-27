package programa04;
import java.util.*;
public class Programa04 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        int n=cin.nextInt();
        if(n%2==0){
            System.out.println(n+" es par");
            if(n%4==0)
                System.out.println(n+" es divisible entre 4");
        }
        else{
            System.out.println(n+" no es par");
        }
    }
}
