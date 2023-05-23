package archivos_003;
import java.io.File;
public class Archivos_003 {
    public static void main(String[] args) {
    try
    { File f1 = new File("C:\\");
      for (int i=0; i<f1.listFiles().length; i++)
        { File f2 = f1.listFiles()[i];
          System.out.println("Nombre: "+f2.getName());
          if (f2.isFile())
            {System.out.println("Tipo: Archivo");
             System.out.println("Tamaño: "+f2.length()+" bytes.");
            }
          else
              System.out.println("Tipo: Directorio");
          
          System.out.println("----------------------------------------------");
        }
    }
    catch(Exception E1)
    {
                
    }
  }
}
