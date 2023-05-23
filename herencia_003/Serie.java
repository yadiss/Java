package herencia_003;
public class Serie extends Television {
    private int Temporadas;
    
    public Serie(String Programa, String Plataforma, int Estreno)
    { super(Programa, Plataforma, Estreno);
    } 
    
    public void setTemporadas(int Temporadas)
    { this.Temporadas=Temporadas;}
    
    public String getTemporadas()
    { System.out.print(getTodo());
      return ". Tiene "+Temporadas+" temporadas.";
    }
    
    public void Intro()
    { System.out.println("|> Omitir intro");}
    
    public void Siguiente()
    { System.out.println("|> Siguiente capítulo");}
    
}
