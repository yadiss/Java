package herencia_002;
public class Alumno extends Persona {
   private String IdAlumno; 
   
   public Alumno(String Nombre, String Apellidos, int Edad)
    { super(Nombre, Apellidos, Edad);
      IdAlumno="Desconocido";
    }
   
   public void setIdAlumno(String IdAlumno)
    { this.IdAlumno=IdAlumno;       
    }
    
    public String getIdAlumno()
    { return IdAlumno;       
    }
    
    @Override
    public String toString()
    { return getNombre() + "" + getApellidos()+" - "+getEdad()+" -"+ getIdAlumno();
        
    }
}
