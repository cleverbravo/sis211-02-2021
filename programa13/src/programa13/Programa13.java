package programa13;
import java.util.*;
public class Programa13 {
    public static void mostrar(Vector<Integer> v){
        System.out.println("inicio foreach");
        for(int x:v){
            System.out.println(x);
        }
        System.out.println("fin foreach");
    }
    public static void mostrarFor(Vector<Integer> v){
        System.out.println("inicio for");
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
        System.out.println("fin for");
    }
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector();
        mostrar(vector);
        vector.add(8);
        vector.add(80);
        vector.add(800);
        mostrar(vector);
        vector.insertElementAt(8000, 2);
        mostrarFor(vector);
        vector.remove(2);
        mostrarFor(vector);
    }
}
