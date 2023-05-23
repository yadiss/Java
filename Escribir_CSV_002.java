package escribir_csv_002;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class Escribir_CSV_002 {
    public static void main(String[] args) {
    try
    { PrintWriter pw = new PrintWriter(new File("Cosas.csv"));
      for (int i=1; i<=5; i++)
        { String Nombre = JOptionPane.showInputDialog(i+". Nombre:");
          String Apellidos = JOptionPane.showInputDialog(i+". Apellidos:");
          String Edad = JOptionPane.showInputDialog(i+". Edad:");
          pw.println(Nombre+","+Apellidos+","+Edad);
        }
      pw.close();
      System.out.println("Eso es todo...");
    }
    catch(Exception E)
    { System.out.println("Probelama "+E);
    }
  }
}
