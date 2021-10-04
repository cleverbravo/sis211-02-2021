package programa29;

public class Programa29 {
    public static void main(String[] args) {
        // TODO code application logic here
        Pares p=new Pares();
        p.start();
        Impares i=new Impares();
        i.start();
    }
}

class Pares extends Thread{
    public void run(){
        for(int i=0;i<10000;i++)
            if(i%2==0)
                System.out.println("par->"+i);
    }
}
class Impares extends Thread{
    public void run(){
        for(int i=0;i<10000;i++)
            if(i%2==1)
                System.out.println("impar->"+i);
    }
}