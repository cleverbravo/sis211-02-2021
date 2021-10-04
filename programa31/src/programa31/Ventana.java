package programa31;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana extends JFrame{
    JButton btnDibujar;
    public Ventana(){
        setSize(600,400);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        btnDibujar=new JButton("Dibujar");
        btnDibujar.setBounds(10,10,50,20);
        btnDibujar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Graphics g=getContentPane().getGraphics();
                g.drawOval(100,100,20,30);
            }
        });
        getContentPane().add(btnDibujar);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawOval(100,100,20,30);
        g.drawOval(115,110, 2, 2);
        g.drawOval(105,110, 2, 2);
        g.drawArc(105,110,10,15, 0, -180);
    }
}
