package programa08;
import java.util.*;

public class Programa08 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        int n=cin.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
