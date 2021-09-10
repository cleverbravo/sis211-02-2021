package programa20;

import javax.swing.*;
public class Programa20 {
    public static void main(String[] args) {
        Ventana v=new Ventana();
        v.setVisible(true);
    }
}
//el constructor es una funcion que tiene el mismo nombre que la clase.
//el constructor no devuelve nada, nisiquiera void
class Ventana extends JFrame{
    public Ventana(){
        setTitle("hola mundo");
        setSize(400,300);
    }
}
