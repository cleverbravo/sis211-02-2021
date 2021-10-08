package programa32;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;
    
public class Ventana extends JFrame implements MouseListener{
    Image oImg,xImg;
    String nombreO,nombreX;
    int turno=0;
    int trica[][]=new int[][]{
        {0,0,0},
        {0,0,0},
        {0,0,0}};
    ArrayList<Imagen> imagenes=new ArrayList();
    public Ventana(){
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        this.addMouseListener(this);
        try
        {
            //JOptionPane.showMessageDialog(null, System.getProperty("user.dir"));
            BufferedImage o=ImageIO.read(new File(".\\build\\classes\\programa32\\emoji_o.jfif"));
            oImg=(Image)o;
            o=ImageIO.read(new File(".\\build\\classes\\programa32\\emoji_x.png"));
            xImg=(Image)o;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        nombreO=JOptionPane.showInputDialog(null, "Introduzca el nombre del jugador de O");
        nombreX=JOptionPane.showInputDialog(null, "Introduzca el nombre del jugador de X");
     }
    void dibujarTablero(Graphics g){
        g.drawLine(150,150,450,150);//horizontal
        g.drawLine(150,250,450,250);//horizontal
        
        g.drawLine(250, 50, 250, 350);//vertical
        g.drawLine(350, 50, 350, 350);//vertical
    }
     public void paint(Graphics g){
        super.paint(g);
        //g.drawImage(oImg, 10, 10, this);
        dibujarTablero(g);
        for(Imagen i:imagenes)
            g.drawImage(i.getImg(),i.getX(),i.getY(),this);
     }
     public void mouseClicked(MouseEvent e){
         //JOptionPane.showMessageDialog(null, "hiciste click en:("+e.getX()+","+e.getY()+")");
         int x=(e.getX()-150)/100;
         int y=(e.getY()-50)/100;
         //JOptionPane.showMessageDialog(null, ""+x+","+y);
         trica[x][y]=turno%2==0?1:-1;
         Imagen nueva=new Imagen();
         nueva.setImg(turno++%2==0?oImg:xImg);
         /*if(turno%2==0)
            nueva.setImg(oImg);
         else
            nueva.setImg(xImg);
         turno++;*/
         nueva.setX(x*100+150+12);
         nueva.setY(y*100+50+12);
         imagenes.add(nueva);
         this.repaint();
         
         if(hayGanador()){
             JOptionPane.showMessageDialog(null, "Hay ganador: jugador "+(trica[x][y]==1?nombreO:nombreX));
         }
    }
    //sistema experto
    //heuristica funcion matematica
    //redes neuronales= requiere calibracion
    //random
    boolean hayGanador(){
        for(int i=0;i<3;i++){
            int h=0,v=0;
            for(int j=0;j<3;j++){
                h+=trica[i][j];
                v+=trica[j][i];
            }
            if(h==3||h==-3 || v==3||v==-3)
                return true;
        }
        int d=0,di=0;
        for(int i=0;i<3;i++){
            d+=trica[i][i];
            di+=trica[i][3-i-1];
        }
        if(d==3||d==-3 || di==3||di==-3)
            return true;
        return false;
    }
    
    public void mousePressed(MouseEvent e) {}
    
    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}
