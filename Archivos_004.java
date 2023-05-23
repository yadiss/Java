package archivos_004;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class Archivos_004 {
    public static void main(String[] args) {
    try
    { //Cuadro de dialogo de los archivos
      JFileChooser jfc = new JFileChooser();
      
      //Filtros
      FileNameExtensionFilter Filtro1 = new FileNameExtensionFilter("Cosos de Java", "Java");
      //Filtro predeterminado
      jfc.setFileFilter(Filtro1);
      FileNameExtensionFilter Filtro2 = new FileNameExtensionFilter("Cosos de texto", "txt");
      //Añade otro filtro
      jfc.addChoosableFileFilter(Filtro2);
      
      int Resp = jfc.showOpenDialog(null);
      if (Resp==JFileChooser.APPROVE_OPTION)
        { System.out.println("Hola");
          //Selecciona elarchivo del cuadro de dialogo
          File f1 = jfc.getSelectedFile();
          JOptionPane.showMessageDialog(null,f1.getAbsolutePath());
          //Lee y guarda los carcateres de un archivo
          FileReader fr = new FileReader(f1);
          //Recibe los caracteres de FileReader
          BufferedReader bf = new BufferedReader(fr);
          String Linea = "";
          while ((Linea=bf.readLine()) != null)
            { System.out.println(Linea);
            //Cierra los flujos de datos
            bf.close();
            fr.close();
            }
        }
    }
    catch (Exception E)
    {
                
    }
    }
    
}
