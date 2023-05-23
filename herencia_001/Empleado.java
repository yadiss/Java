package herencia_001;
public class Empleado extends Persona {
    private String Puesto;
    private String LugarTrabajo;
    private double Sueldo;
    
    public Empleado(String Nombre, String Apellidos, int Edad, String Puesto, String LugarTrabajo, double Sueldo)
    { super(Nombre,Apellidos,Edad);
      this.Puesto=Puesto;
      this.LugarTrabajo=LugarTrabajo;
      this.Sueldo=Sueldo;
    }
    @Override
    public void Mostrar()
    { super.Mostrar();
      System.out.println("Puesto: "+Puesto);
      System.out.println("Lugar de trabajo: "+LugarTrabajo);
      System.out.println("Sueldo: "+Sueldo);
    }
}
