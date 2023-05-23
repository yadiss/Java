package paquete;
/*Mentía, cuando te decía quédate tranquila corazón, nos separaremos en términos buenos
vuelvo con mi vida soy buen perdedor. Y ahora te sigo a toda hora, tengo que saber con quien estás.
No hay nada positivo, y se vuelve adictivo, y yo que pensé que a mí no me podía pasar
Yadira García Coca 22220908*/
import javax.swing.JOptionPane;
import menu.Menu;
public class MenúHora {
public static void main(String[] args) {
  String Opciones[]=new String[]{"Fecha en formato largo","Fecha en formato corto"
            ,"Fecha","Tiempo en formato de 12", "Tiempo en formato de 24"};
  Menu Menu1= new Menu(Opciones); 
  int Opcion=0;
  do{
  Opcion=Menu1.getOpcion();
  switch (Opcion)
  { case 1:
      JOptionPane.showMessageDialog(null,Tiempo.FechaFormatoLargo()); break;
    case 2:
      JOptionPane.showMessageDialog(null,Tiempo.FechaFormatoCorto()); break;
    case 3:
      JOptionPane.showMessageDialog(null,Tiempo.Fecha()); break;
    case 4: 
      JOptionPane.showMessageDialog(null,Tiempo.HoraF12()); break;
    case 5: 
      JOptionPane.showMessageDialog(null,Tiempo.HoraF24()); break;
    case 6: break;
    default:
     JOptionPane.showMessageDialog(null, "Selección no válida"); break;
   }
  }
  while(Opcion != 6);  
 } 
public static void Presentar(String Texto, String Titulo)
{ JOptionPane.showMessageDialog(null, Texto, Titulo,
        JOptionPane.INFORMATION_MESSAGE);
    
}
}
    
