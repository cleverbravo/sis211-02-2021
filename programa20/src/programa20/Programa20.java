package programa20;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Programa20 {
    public static void main(String[] args) {
        Ventana v=new Ventana();
        v.setVisible(true);
    }
}
//el constructor es una funcion que tiene el mismo nombre que la clase.
//el constructor no devuelve nada, nisiquiera void
class Ventana extends JFrame{
    JButton button,b2;
    public Ventana(){
        setTitle("hola mundo");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        button=new JButton();
        button.setText("Clickme");
        button.setBounds(10, 10, 100, 20);
        getContentPane().add(button);
        
        Paquita onclick=new Paquita();
        button.addActionListener(onclick);
        
        b2=new JButton("Boton 2");
        b2.setBounds(10,100,80,20);
        getContentPane().add(b2);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                JOptionPane.showMessageDialog(null, "adios");
            }
        });
    }
}

class Paquita implements ActionListener{
    public void actionPerformed(ActionEvent evt){
        //System.out.println("hiciste click");
        JOptionPane.showMessageDialog(null, "hiciste click");
        JButton button=(JButton)evt.getSource();
        button.setBackground(Color.red);
        button.setLocation(button.getLocation().x+10, button.getLocation().y);
    }
}
