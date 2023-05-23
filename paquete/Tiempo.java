package paquete;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Tiempo {
    public static String FechaFormatoLargo()
    { Calendar Fecha = new GregorianCalendar();
      String fecha ="Hoy es ";
      switch (Fecha.get(Calendar.DAY_OF_WEEK))
      { case 1: fecha+="domingo"; break;
        case 2: fecha+="lunes"; break;
        case 3: fecha+="martes"; break;
        case 4: fecha+="miércoles"; break;
        case 5: fecha+="jueves"; break;
        case 6: fecha+="viernes"; break;
        case 7: fecha+="sábado"; break;
      }
      fecha += ", "+Fecha.get(Calendar.DAY_OF_MONTH)+" de ";
      switch (Fecha.get(Calendar.MONTH)) 
      { case 0: fecha+="enero"; break;
        case 1: fecha+="febrero"; break;
        case 2: fecha+="marzo"; break;
        case 3: fecha+="abril"; break;
        case 4: fecha+="mayo"; break;
        case 5: fecha+="junio"; break;
        case 6: fecha+="julio"; break;
        case 7: fecha+="agosto"; break;
        case 8: fecha+="septiembre"; break;
        case 9: fecha+="octubre"; break;
        case 10: fecha+="noviembre"; break;
        case 11: fecha+="diciembre"; break;
      }
      fecha+=" de "+Fecha.get(Calendar.YEAR)+"\n";
      int Hora=Fecha.get(Calendar.HOUR_OF_DAY);
      int Minuto=Fecha.get(Calendar.MINUTE);
      int Segundo=Fecha.get(Calendar.SECOND);
      int Micro=Fecha.get(Calendar.MILLISECOND);
      fecha += "La hora es ";
      fecha += (Hora<10? "0" + Hora : Hora)+":";
      fecha += (Minuto<10? "0" + Minuto : Minuto)+":";
      fecha += (Segundo<10? "0" + Segundo : Segundo)+":";
      fecha+=Micro+" hrs.";
      return fecha;
    }
    public static String FechaFormatoCorto()
    { Calendar Fecha = new GregorianCalendar();
      int Dia= Fecha.get(Calendar.DAY_OF_MONTH);
      int Mes=Fecha.get(Calendar.MONTH);
      int Año=Fecha.get(Calendar.YEAR);
      int Hora=Fecha.get(Calendar.HOUR_OF_DAY);
      int Minuto=Fecha.get(Calendar.MINUTE);
      int Segundo=Fecha.get(Calendar.SECOND);
      String fecha = "";
      fecha += Dia+"/"+(Mes+1)+"/"+Año+"\n";
      fecha += (Hora<10? "0" + Hora : Hora)+":";
      fecha += (Minuto<10? "0" + Minuto : Minuto)+":";
      fecha += (Segundo<10? "0" + Segundo : Segundo);
      fecha += (Fecha.get(Calendar.HOUR_OF_DAY)<12? "a.m" : "p.m");
      return fecha;
    }
    public static String Fecha()
    { Calendar Fecha = new GregorianCalendar();
      int Dia= Fecha.get(Calendar.DAY_OF_MONTH);
      int Mes=Fecha.get(Calendar.MONTH);
      int Año=Fecha.get(Calendar.YEAR);
      String fecha = "";
      fecha += Dia+"/"+(Mes+1)+"/"+Año;
      return fecha;
    }
    public static String HoraF12()
    { Calendar Fecha = new GregorianCalendar();
      int Hora=Fecha.get(Calendar.HOUR);
      int Minuto=Fecha.get(Calendar.MINUTE);
      int Segundo=Fecha.get(Calendar.SECOND);
      String fecha = "";
      fecha += (Hora<10? "0" + Hora : Hora)+":";
      fecha += (Minuto<10? "0" + Minuto : Minuto)+":";
      fecha += (Segundo<10? "0" + Segundo : Segundo)+" ";
      fecha += (Fecha.get(Calendar.HOUR_OF_DAY)<12? "a.m" : "p.m");
      return fecha;
    }
    public static String HoraF24()
    { Calendar Fecha = new GregorianCalendar();
      int Hora=Fecha.get(Calendar.HOUR_OF_DAY);
      int Minuto=Fecha.get(Calendar.MINUTE);
      int Segundo=Fecha.get(Calendar.SECOND);
      String fecha = "";
      fecha += (Hora<10? "0" + Hora : Hora)+":";
      fecha += (Minuto<10? "0" + Minuto : Minuto)+":";
      fecha += (Segundo<10? "0" + Segundo : Segundo)+" ";
      fecha += (Fecha.get(Calendar.HOUR_OF_DAY)<12? "a.m" : "p.m");
      return fecha;
    }
}
