package programa06;
import java.util.*;
public class Programa06 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Introduzca una operacion aritmetica separada por espacios:(ej.2 + 3)");
        double a=cin.nextDouble(),c=0;
        char op=cin.next().charAt(0);
        double b=cin.nextDouble();
        switch(op){
            case '+':
                c=a+b;
                break;
            case '-':
                c=a-b;
                break;
            case '*':
                c=a*b;
                break;
            case '/':
                if(b==0)
                    System.out.println("Error de division por cero");
                c=a/b;
                break;
            default:
                System.out.println("Error el operador no es valido.");
        }
        System.out.println(""+a+op+b+"="+c);
    }
}
