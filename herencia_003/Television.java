package herencia_003;
public class Television {
    private String Programa, Plataforma;
    private int Estreno;
    
    public Television( String Programa, String Plataforma, int Estreno)
    { this.Programa=Programa; this.Plataforma=Plataforma; this.Estreno=Estreno;
    }
    
    public String getTodo()
    { return Programa+" estrenado en el "+Estreno+" lo puedes ver en "+Plataforma;}
}

