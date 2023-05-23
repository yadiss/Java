package leer_csv_001;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Leer_CSV_001 {
    public static void main(String[] args) {
    try
    { File f = new File("E:\\Trabajos\\Escribir_CSV_002\\Cosas.csv");
      FileReader fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr);
      String Linea = "";
      int Contador = 1;
      while ((Linea = br.readLine()) != null)
      { //System.out.println(Linea);
        //Divide el texto en cada elemento que haya entre el paréntesis 
        String Datos[] = Linea.split(",");
        System.out.print(Contador+". ");
        //System.out.println(Contador+". "+Datos[0]+" "+Datos[1]+" "+Datos[2]);
        for (int i=0; i<Datos.length; i++)
            { System.out.print(Datos[i]+" ");
            }
        System.out.println();
        Contador++;
      }
      br.close();
      fr.close();
    }
    catch(Exception E)
    { System.out.println("Error: "+E);
    }
    
    /*Tarea
    1. Hacer un programa donde el usuario escribael nombre del archivo por cuadro de dialogo
    2. Hacer un programa donde lea el archivo que seleccionemos 
    */
  }
}
