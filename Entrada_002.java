package entrada_002;
import javax.swing.JOptionPane;
public class Entrada_002 {
public static void main(String[] args) {
        String Nombre;
        Nombre=JOptionPane.showInputDialog("Dame tu nombre: ");
        System.out.println("Hola "+Nombre);
        JOptionPane.showMessageDialog(null,"Hola " +Nombre);
        String Valor;
        Valor=JOptionPane.showInputDialog(Nombre+" dame tu edad: ");
        int Edad = Integer.parseInt(Valor);
        JOptionPane.showMessageDialog(null,Nombre+" tiene "+Edad+" años y en 10 años tendrá "+(Edad+10));
        float Estatura;
        Valor=JOptionPane.showInputDialog(Nombre+" dame tu estatura: ");
    }
    
}
