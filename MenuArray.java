package menuarray;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class MenuArray {
    public static void main(String[] args) {
    try
    { ArrayList <String> Lista = new ArrayList(); 
      int Resp;
      File f1 = new File("Mi_Lista.txt");
      if (f1.exists())
        { BufferedReader BR = new BufferedReader(new FileReader(f1));
          String Texto = "";
          while((Texto = BR.readLine()) != null)
          { Lista.add(Texto);
          }
        }
      else
        { f1.createNewFile();
        }
      do
      { String Num = Entrada("Selecciona una opción:\n1. Altas\n2. Bajas\n3.Edición\n4. Mostrar\n5. Mostrar todos\n6. Salir");
        Resp = Integer.parseInt(Num);
        switch(Resp)
        { case 1:
            String Nombre = Entrada("Dame un nombre:");
            if(Lista.contains(Nombre))
                Mensaje(Nombre+" ya está, no se agregó");
            else
                { Lista.add(Nombre);
                  Mensaje(Nombre+" no estaba, pero ya se agregó.");
                }
            break;
          case 2:
              Nombre = Entrada("Nombre a dar de baja:");
              if(Lista.remove(Nombre))
                Mensaje("PUM "+Nombre+" ya se fue");
              else
                Mensaje(Nombre+" no estaba");
              break;
          case 3:
              Nombre = Entrada("Nombre a cambiar: ");
              int pos = Lista.indexOf(Nombre);
              Nombre = Entrada("¿Qué nombre quieres agregar?");
              Lista.set(pos, Nombre);
              break;
          case 4:
            Nombre = Entrada("Dame el nombre para ver si está:");
            if(Lista.contains(Nombre))
                Mensaje(Nombre+", sí está.");
            else
                { Mensaje(Nombre+", no está.");
                }
          case 5:
              MostrarLista(Lista);
              break;
        }
      }
      while(Resp != 6);
      
      PrintWriter PW = new PrintWriter(f1);
      for (String X: Lista)
        { PW.println(X);
        }
      PW.close();
    }
    catch(Exception X)
    { System.out.println("Error: "+X);
    }
  }
    public static void Mensaje(String Texto)
    { JOptionPane.showMessageDialog(null, Texto);
    }
    
    public static void MostrarLista(ArrayList <String> Lista)
    { for(int i=0; i<Lista.size(); i++)
        System.out.println(Lista.get(i));
    }
    
    public static String Entrada(String Texto)
    { return JOptionPane.showInputDialog(Texto);
    }
}