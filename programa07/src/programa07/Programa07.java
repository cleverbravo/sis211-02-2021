package programa07;
import java.util.*;
public class Programa07 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        int n=cin.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
