package programa30;
import javax.swing.*;
public class Par extends Thread{
    int cantidad;
    JTextArea txtOutput;
    public Par(int c,JTextArea output){
        cantidad=c;
        txtOutput=output;
    }
    public void run(){
        for(int i=0;i<=cantidad;i++)
            if(i%2==0)
                txtOutput.setText(txtOutput.getText()+"\n"+i);
    }
}
