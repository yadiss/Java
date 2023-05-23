package herencia_002;
public class Practicante extends Persona {
    private String IdPracticante; 
   
   public Practicante(String Nombre, String Apellidos, int Edad)
    { super(Nombre, Apellidos, Edad);
      IdPracticante="Desconocido";
    }
   
   public void setIdPracticante(String IdPracticante)
    { this.IdPracticante=IdPracticante;       
    }
    
    public String getIdPracticante()
    { return IdPracticante;       
    }
    
    @Override
    public String toString()
    { return getNombre() + "" + getApellidos()+" - "+getEdad()+" -"+ getIdPracticante();
        
    }
}
