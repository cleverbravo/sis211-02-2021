package programa33;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Imagen {
    public static Image crearImagen(String ruta){
        try
        {
            BufferedImage o=ImageIO.read(new File(ruta));
            return (Image)o;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
}
