package programa33;

//trica

import java.awt.*;
import java.util.*;

public class GameUI {
    private Trica trica;
    private Image oImg,xImg;
    
    public GameUI(){
        trica=new Trica();
        oImg=Imagen.crearImagen(Datos.oImagenRuta);
        xImg=Imagen.crearImagen(Datos.xImagenRuta);
    }
    public Trica getTrica(){
        return trica;
    }
    private void dibujarTablero(Graphics g){
        g.drawLine(150,150,450,150);//horizontal
        g.drawLine(150,250,450,250);//horizontal
        
        g.drawLine(250, 50, 250, 350);//vertical
        g.drawLine(350, 50, 350, 350);//vertical
    }
    private void dibujarJugadores(Graphics g){
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                if(trica.trica[i][j]!=0){
                    Image player=trica.trica[i][j]==1?oImg:xImg;
                    g.drawImage(player,i*100+150+12,j*100+50+12,null);
                }
            }
    }
    public void dibujar(Graphics g){
        dibujarTablero(g);
        dibujarJugadores(g);
    }
}
