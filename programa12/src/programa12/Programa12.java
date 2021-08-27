package programa12;
import java.util.*;
public class Programa12 {
    public static void main(String[] args) {
        double matrix[][]=new double[3][2];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=Math.random()*100;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("foreach:");
        for(double v[]:matrix){
            for(double x:v)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}
