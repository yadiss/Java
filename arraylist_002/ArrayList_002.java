package arraylist_002;
import java.util.ArrayList;
public class ArrayList_002 {
    public static void main(String[] args) {
    ArrayList <Producto> Lista = new ArrayList();
    Producto P1 = new Producto("Manzana",53.90);
    Lista.add(P1);
    Lista.add(new Producto("Mangos",39.90));
    Lista.add(new Producto("Plátano", 27.90));
    Lista.add(new Producto("Papaya",27.90));
    Lista.add(new Producto("Melón",31.90));
    
    for(Producto PX: Lista)
        System.out.println(PX.toString());
    System.out.println(Lista.get(3).toString());
  }
}
