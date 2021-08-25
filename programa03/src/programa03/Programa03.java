package programa03;

public class Programa03 {
    //suma(int,int)
    public static int suma(int a,int b){
        return a+b;
    }
    //suma(float,float)
    public static float suma(float a,float b){
        return a+b;
    }
    public static int resta(int a,int b){
        return a-b;
    }
    public static int multiplicacion(int a,int b){
        return a*b;
    }
    public static float division(float a, float b){
        if(b==0){
            System.out.println("Error");
        }
        return a/b;
    }
    public static void main(String[] args) {
        int c=suma(8,90);
        System.out.println("suma="+c);
        c=resta(8,90);
        System.out.println("resta="+c);
        c=multiplicacion(8,90);
        System.out.println("multiplicacion="+c);
        float c2=division(8,0);
        System.out.println("division="+c2);
        float c3=suma(c2,10);
        System.out.println("Total="+c2);
    }
}
