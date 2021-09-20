import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//determinar si un numero es primo
public class Programa23{
    public static void main(String args[]){
        Ventana v=new Ventana();
        v.setVisible(true);
    }
}
class Ventana extends JFrame{
    JLabel lblN;
    JTextField txtN;
    JButton btnPrimeTest;
    Container pane;
    public Ventana(){
        this.setLayout(null);
        this.setTitle("Prime test");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane=this.getContentPane();

        lblN=new JLabel("N:");
        lblN.setBounds(50,50,30,20);
        
        txtN=new JTextField();
        txtN.setBounds(100,50,60,20);

        btnPrimeTest=new JButton("Test Prime");
        btnPrimeTest.setBounds(40,100,160,20);
        btnPrimeTest.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                int n=Integer.parseInt(txtN.getText());
                for(int i=2;i<=Math.sqrt(n);i++)
                    if(n%i==0){
                        JOptionPane.showMessageDialog(null, "Not prime");
                        return;
                    }
                JOptionPane.showMessageDialog(null, "Prime", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        pane.add(lblN);
        pane.add(txtN);
        pane.add(btnPrimeTest);
    }
}