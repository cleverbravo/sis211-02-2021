package programa33;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;

public class Ventana extends JFrame implements MouseListener{
    GameUI game;
    public Ventana(){
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        this.addMouseListener(this);
        game=new GameUI();
    }
    public void paint(Graphics g){
        //super.paint(g);
        game.dibujar(g);
    }
    public void mouseClicked(MouseEvent e){
        int x=(e.getX()-150)/100;
        int y=(e.getY()-50)/100;
        game.getTrica().nuevaMovida(x, y);
        this.repaint();
        int jugador;
        if((jugador=game.getTrica().hayGanador())!=0){
            if(jugador==100)
                JOptionPane.showMessageDialog(null,"Empate");
            else
                JOptionPane.showMessageDialog(null, "Gano:"+(jugador==1?Datos.oPlayer:Datos.xPlayer));
        }
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}
