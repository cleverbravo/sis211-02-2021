package programa33;

import javax.swing.JOptionPane;

public class Programa33 {
    public static void main(String[] args) {
        Datos.oPlayer=JOptionPane.showInputDialog(null,"Nombre del jugador O:");
        Datos.xPlayer=JOptionPane.showInputDialog(null,"Nombre del jugador X:");
        Ventana v=new Ventana();
        v.setVisible(true);
    }
}
