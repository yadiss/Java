package herencia_003;
public class Pelicula extends Television {
    private String Saga;
    
    public Pelicula(String Programa, String Plataforma, int Estreno)
    { super(Programa, Plataforma, Estreno);
    }
    
    public void setSaga(String Saga)
    { this.Saga=Saga;}
    
    public String getSaga()
    { System.out.print(getTodo()); return ". "+Saga + " es saga.";
    }
    
    public void Palomitas()
    { System.out.println("*****preprando palomitas*****");}
    
    public void Pausar()
    { System.out.println("|| Pausa");
        
    }
}
