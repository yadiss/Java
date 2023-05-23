package herencia_002;
public class Profesor extends Persona {
    private String IdProfesor;
    
    public Profesor(String Nombre, String Apellidos, int Edad)
    { super(Nombre, Apellidos, Edad);
      IdProfesor="Desconocido";
    }
    
    public void setIdProfesor(String IdProfesor)
    { this.IdProfesor=IdProfesor;       
    }
    
    public String getIdProfesor()
    { return IdProfesor;       
    }
    
    @Override
    public String toString()
    { return getNombre() + "" + getApellidos()+" - "+getEdad()+" -"+ getIdProfesor();
        
    }
}
