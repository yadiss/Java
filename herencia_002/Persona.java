package herencia_002;
public class Persona {
  private String Nombre, Apellidos;
  private int Edad;

  public Persona(String Nombre, String Apellido, int Edad)
  { this.Nombre=Nombre;
    this.Apellidos=Apellidos;
    this.Edad=Edad;
  }
  
  public String getNombre()
  {  return Nombre;}
  
  public String getApellidos()
  {  return Apellidos;}
  
  public int getEdad()
  {  return Edad;}
}
