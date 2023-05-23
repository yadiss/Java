package explorador;
import java.io.File;
import java.text.NumberFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class Explorador {
    public static void main(String[] args) {
    int Opc;
    do
    { JFileChooser jfc = new JFileChooser();
      jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      int Resp = jfc.showDialog(null, "Selecciona esta carpeta");
      if(Resp == JFileChooser.APPROVE_OPTION)
        Explorar(jfc.getSelectedFile());
      Opc = JOptionPane.showConfirmDialog(null,"¿De nuevo?","Explorar",JOptionPane.YES_NO_OPTION);
    }
    while(Opc == JOptionPane.YES_OPTION);
    }
    
    public static void Explorar(File Carpeta)
    { try
     { System.out.println(Carpeta.getAbsolutePath());
       for(File Elemento: Carpeta.listFiles())
        { if(Elemento.isDirectory())
            { Explorar(Elemento);
            }
          else
            { System.out.print(Elemento.getAbsolutePath());
              System.out.println(" - "+Formato(Elemento.length())+" bytes");
            }
        }
     }
     catch(Exception X)
     {System.out.println("Error: "+X);}
    }
    
    public static String Formato(double Numero)
    { NumberFormat MiFormato = NumberFormat.getNumberInstance();
      return MiFormato.format(Numero);
    }
}