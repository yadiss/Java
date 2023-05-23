package archivos_002;
import java.io.File;
import javax.swing.JOptionPane;
public class Archivos_002 {
    public static void main(String[] args) {
    try
    { String Nombre="Mi_Lista.txt";
      File f1 = new File(Nombre);
    
      if (f1.exists())
        { int Resp = JOptionPane.showConfirmDialog(null,Nombre+" sí existe, ¿desea borrarlo?","Borrar",JOptionPane.OK_CANCEL_OPTION);
          if (Resp==JOptionPane.OK_OPTION)
            { f1.delete();
                JOptionPane.showMessageDialog(null,"Matamos a "+Nombre);
            }
        }
      else
        { int Resp=JOptionPane.showConfirmDialog(null,Nombre+" no existe, ¿desea crearlo?","Crear",JOptionPane.OK_CANCEL_OPTION);
          if(Resp==JOptionPane.OK_OPTION)
            { f1.createNewFile();
              JOptionPane.showMessageDialog(null,f1.getAbsolutePath());
            }
        }
    }
    catch(Exception E)
    {
    }
  }
    
}
