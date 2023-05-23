package escribir_csv_001;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class Escribir_CSV_001 {
    public static void main(String[] args) {
    try
    {File f = new File("Cosas.csv");
     PrintWriter pw = new PrintWriter(f);
     String Linea = "";
     pw.println("Nombre,Apellidos,Edad");
     do
     { Linea = JOptionPane.showInputDialog("Escribe Nombre, apellidos y edad, separados por coma: Nombre,Apellidos,Edad.");
       if (Linea != null)
           pw.println(Linea);
     }
     while (Linea != null);
     pw.close();
    }
    catch (Exception E)
    {System.out.println(E);
    }
  }
}