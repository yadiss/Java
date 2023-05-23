package fecha;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Fecha {
public static void main(String[] args) {
 Calendar Fecha = new GregorianCalendar();
 int DiaSem, Dia, Mes, Año, Hora, Minuto, Segundo, Micro;
 String diasem, mes;
 Dia= Fecha.get(Calendar.DAY_OF_MONTH);
 DiaSem=Fecha.get(Calendar.DAY_OF_WEEK);
 Mes=Fecha.get(Calendar.MONTH);
 Año=Fecha.get(Calendar.YEAR);
 Hora=Fecha.get(Calendar.HOUR_OF_DAY);
 Minuto=Fecha.get(Calendar.MINUTE);
 Segundo=Fecha.get(Calendar.SECOND);
 Micro=Fecha.get(Calendar.MILLISECOND);
 System.out.print("Hoy es ");
 switch (DiaSem){
     case 1: System.out.print("domingo"); break;
     case 2: System.out.print("lunes"); break;
     case 3: System.out.print("martes"); break;
     case 4: System.out.print("miércoles"); break;
     case 5: System.out.print("jueves"); break;
     case 6: System.out.print("viernes"); break;
     case 7: System.out.print("sábado"); break;
  }
 System.out.print(", "+Dia+" de ");
 switch(Mes){
     case 0: System.out.print("enero"); break;
     case 1: System.out.print("febrero"); break;
     case 2: System.out.print("marzo"); break;
     case 3: System.out.print("abril"); break;
     case 4: System.out.print("mayo"); break;
     case 5: System.out.print("junio"); break;
     case 6: System.out.print("julio"); break;
     case 7: System.out.print("agosto"); break;
     case 8: System.out.print("septiembre"); break;
     case 9: System.out.print("octubre"); break;
     case 10: System.out.print("noviembre"); break;
     case 11: System.out.print("diciembre"); break;
  }
 System.out.println(" de "+Año+". La hora es "+Hora+":"+Minuto+":"+Segundo+":"+Micro);
 }   
}
