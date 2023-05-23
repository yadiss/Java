package herencia_001;
/* Clase derivada
   Clase hija
   Sub Clase
*/
public class Estudiante extends Persona
{ private String Matrícula;
  private String Escuela;
  private String Carrera;
  
  public Estudiante(String Matrícula, String Nombre, String Apellidos, int Edad, String Escuela, String Carrera)
  { super(Nombre, Apellidos, Edad);
    this.Matrícula=Matrícula;
    this.Carrera=Carrera;
    this.Escuela=Escuela;
  }
  @Override //Para usar Estudiante.Mostrar en lugar de Person.Mostrar
  public void Mostrar()
  { System.out.println("****Estudiante****");
    System.out.println("Matrícula: "+Matrícula);
    System.out.println("Nombre: "+Nombre+" "+Apellidos);
    System.out.println("Edad: "+Edad+" años");
    System.out.println("Escuela: "+Escuela);
    System.out.println("Carrera: "+Carrera);
  }
}
