package excepciones_003;

import javax.swing.JOptionPane;

public class Excepciones_003 {
public static void main(String[] args) {
    int Opcion=JOptionPane.showConfirmDialog(null,"Hola","Preguntar",JOptionPane.YES_NO_CANCEL_OPTION);
    System.out.println("El botón vale: "+Opcion);
    switch (Opcion)
    { case JOptionPane.YES_OPTION:
       JOptionPane.showMessageDialog(null,"Dijiste que sí");  
       break;
      case JOptionPane.NO_OPTION:
       JOptionPane.showMessageDialog(null,"Dijiste que no");
       break;
      case JOptionPane.CANCEL_OPTION:
       JOptionPane.showMessageDialog(null,"Cancelado");
       break;
    }
 }   
}
