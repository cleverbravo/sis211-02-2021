package programa09;
import java.util.*;
public class Programa09 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        int n=cin.nextInt();
        int i=1;
        do{
            int j=1;
            do{
                System.out.print("*");
                j++;
            }while(j<=i);
            System.out.println();
            i++;
        }while(i<=n);
    }
}
