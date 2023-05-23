package herencia_004;
import java.util.ArrayList;
public class Herencia_004 {
public static void main(String[] args) {
    ArrayList<UnidadOptica> Equipos = new ArrayList();
    UnidadCD UniCD = new UnidadCD("HP","HPCD-123",1998,8);
    System.out.println(UniCD);
    System.out.println("\n");
    UnidadCDWriter UniCDW = new UnidadCDWriter("Kingston","KNG",2001,16,8);
    System.out.println(UniCDW);
    System.out.println("\n");
    UnidadDVD UniDVD = new UnidadDVD("hs","hsdgh",2011,6,8);
    System.out.println(UniDVD);
    System.out.println("\n");
    UnidadDVDWriter UniDVDW = new UnidadDVDWriter("jsj","sjdh",55,524,77,63,541);
    System.out.println(UniDVDW);
    System.out.println("\n");
    UnidadBD UniBD = new UnidadBD("hshs","mquwh",2010,34,25,84);
    System.out.println(UniBD);
    UnidadBDWriter UniBDW = new UnidadBDWriter("sjs","jwj",2014,11,25,58,54,58,14);
    System.out.println(UniBDW);
    
    System.out.println("-----------------------------------------");
    System.out.println("Agregando objetos al arreglo...");
    Equipos.add(UniCD);
    Equipos.add(UniCDW);
    Equipos.add(UniDVD);
    Equipos.add(UniDVDW);
    Equipos.add(UniBD);
    Equipos.add(UniBDW);
    for (UnidadOptica MiEquipo: Equipos)
    { System.out.println("---------------------------------------");
      System.out.println(MiEquipo);
    }
 }
    
}
