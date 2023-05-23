package herencia_003;
public class Documental extends Pelicula{
    private String Tipo;
    
    public Documental(String Programa, String Plataforma, int Estreno)
    { super(Programa, Plataforma, Estreno);
    } 
    
    public void setTipo(String Tipo)
    { this.Tipo=Tipo;}
    
    public String getTipo()
    { System.out.print(getTodo());
      return ". El documental es de tipo "+Tipo;  
    }
    
    public void Reproducir()
    { System.out.println("|> Reproduciendo...");}
    
    public void Informacion()
    { System.out.println("****Obteniendo información acerca de este documental****");}
    
}
