package calendario;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Calendario {
public static void main(String[] args) {
  Calendar MiCal = new GregorianCalendar();
  System.out.println(MiCal.get(Calendar.DAY_OF_MONTH));  
  System.out.println(MiCal.get(Calendar.DAY_OF_WEEK));  
  System.out.println(MiCal.get(Calendar.DAY_OF_WEEK_IN_MONTH));//por ejemplo, si es el primer o segundo viernes del mes  
  System.out.println(MiCal.get(Calendar.DAY_OF_YEAR)); 
  System.out.println(MiCal.get(Calendar.HOUR));
  System.out.println(MiCal.get(Calendar.HOUR_OF_DAY));
  System.out.println(MiCal.get(Calendar.MINUTE));  
  System.out.println(MiCal.get(Calendar.SECOND));
  System.out.println(MiCal.get(Calendar.MILLISECOND));
  System.out.println(MiCal.get(Calendar.MONTH));
  System.out.println(MiCal.get(Calendar.WEEK_OF_MONTH));
  System.out.println(MiCal.get(Calendar.WEEK_OF_YEAR));
  System.out.println(MiCal.get(Calendar.YEAR));    
 }  
}
