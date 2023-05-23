package arraylist_001;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ArrayList_001 {
    public static void main(String[] args) {
    ArrayList <String> Lista = new ArrayList();
    Lista.add("Quackity");
    Lista.add("Roier");
    Lista.add("Mafer Rocha");
    Lista.add("Axozer");
    Lista.add("Foolish");
    Lista.add("Jaiden");
    Lista.add("Quackity");
    
    for(String Elemento: Lista)
        System.out.println(Elemento);
    
    System.out.println("--------------------------");
    System.out.println("Primer Quackity: "+Lista.indexOf("Quackity"));
    System.out.println("Último Quackity: "+Lista.lastIndexOf("Quackity"));
    Separador(26);
    String Nombre = Entrada("Dame un nombre:");
    if(Lista.contains(Nombre))
        Mensaje(Nombre+" ya está, no se agregó");
    else
        { Lista.add(Nombre);
          Mensaje(Nombre+" no estaba, pero ya se agregó.");
        }
    MostrarLista(Lista);
    Separador(26);
    Nombre = Entrada("Nombre a dar de baja:");
    if(Lista.remove(Nombre))
        Mensaje("PUM "+Nombre+" ya se fue");
    else
        Mensaje(Nombre+" no estaba :p");
    MostrarLista(Lista);
    Separador(26);
    Lista.add(2, "Rivers");
    MostrarLista(Lista);
    Separador(26);
    Lista.set(3, "Vegetta");
    MostrarLista(Lista);
  }
    
    public static void Separador(int N)
    { for(int Veces=1; Veces<=N; Veces++)
        System.out.print("-");
      System.out.println();
    }
    
    public static void Mensaje(String Texto)
    { JOptionPane.showMessageDialog(null, Texto);
    }
    
    public static void MostrarLista(ArrayList <String> Lista)
    { for(int i=0; i<Lista.size(); i++)
        System.out.println("["+i+"] => "+Lista.get(i));
    }
    
    public static String Entrada(String Texto)
    { return JOptionPane.showInputDialog(Texto);
    }
}