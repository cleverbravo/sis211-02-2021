package programa21;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame{
    JLabel lblA,lblB;
    JTextField txtA,txtB;
    JButton btnSumar;
    Container pane;
    public Ventana(){
        setLayout(null);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblA=new JLabel("A:");
        lblA.setBounds(50,20,50,20);
        
        lblB=new JLabel("B:");
        lblB.setBounds(50,50,50,20);
        
        txtA=new JTextField();
        txtA.setBounds(110,20,50,20);
        
        txtB=new JTextField();
        txtB.setBounds(110,50,50,20);
        
        btnSumar=new JButton("Sumar");
        btnSumar.setBounds(100,100,80,20);
        btnSumar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                //System.out.println("en A se encuentra el valor de:"+txtA.getText());
                //System.out.println("en B se encuentra el valor de:"+txtB.getText());
                int a=Integer.parseInt(txtA.getText());
                int b=Integer.parseInt(txtB.getText());
                int c=a+b;
                JOptionPane.showMessageDialog(pane, "la suma es:"+c);
            }
        });
        
        pane=getContentPane();
        pane.add(lblA);
        pane.add(lblB);
        pane.add(txtA);
        pane.add(txtB);
        pane.add(btnSumar);
        
        
    }
    
}
