package programa14;
import java.util.*;
public class Programa14 {
    public static void mostrar(ArrayList<Integer> v){
        System.out.println("inicio foreach");
        for(int x:v){
            System.out.println(x);
        }
        System.out.println("fin foreach");
    }
    public static void mostrarFor(ArrayList<Integer> v){
        System.out.println("inicio for");
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
        System.out.println("fin for");
    }
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList();
        mostrar(array);
        array.add(8);
        array.add(80);
        array.add(800);
        mostrar(array);
        array.remove(2);
        mostrarFor(array);
    }
}
