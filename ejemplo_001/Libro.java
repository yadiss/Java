package ejemplo_001;
public class Libro {
    private String Titulo;
    private String Autor;
    
    public Libro()
    { Titulo = "";
      Autor= "";  
    }
    
    public Libro (String Titulo)
    { this.Titulo = Titulo;
      Autor="";
    }
    
    public Libro(String Titulo, String Autor)
    { this.Titulo=Titulo;
      this.Autor=Autor;
    }
    
    public void setTitulo (String Titulo)
    { this.Titulo = Titulo;
    }
    
    public String getTitulo()
    { return Titulo;
    }
    
    public void Mostrar ()
    { System.out.println("******************");
      System.out.println("Título del libro: "+Titulo);
      System.out.println("Autor del libro: "+Autor);
        
    }
    public void setAutor (String Autor)
    { this.Autor=Autor;
    }
    public String getAutor()
    { return Autor;
    }
}
