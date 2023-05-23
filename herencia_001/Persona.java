package herencia_001;
/* Clase Base
   Clase Padre
   Super clase
*/
public class Persona {
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;
    
    public Persona(String Nombre, String Apellidos, int Edad)
    { this.Nombre=Nombre;
      this.Apellidos=Apellidos;
      this.Edad=Edad;
    }
    public void Mostrar ()
    { System.out.println("****Persona****");
      System.out.println("Nombre: "+Nombre);
      System.out.println("Apellidos: "+Apellidos);
      System.out.println("Edad: "+Edad+" años");
    }
}
