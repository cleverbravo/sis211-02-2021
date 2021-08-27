package programa11;
import java.util.*;
public class Programa11 {
    public static void main(String[] args) {
        int v[]=new int[10];
        for(int i=0;i<v.length;i++)
            v[i]=(int)(Math.random()*10);
        for(int x:v)
            System.out.println(x);
        int a=v[4]*v[v[0]];
        v[5]=-1;
        System.out.println(a);
    }
}
