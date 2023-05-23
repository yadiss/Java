package figuras;
public class Rectangulo {
    private int Base, Altura, Area, Perimetro;
    public Rectangulo (int Base, int Altura)
    { this.Base=Base;
      this.Altura=Altura;
      Calculos();
    }
    
    public void Calculos()
    { Area=Base*Altura;
      Perimetro=(Base*2)+(Altura*2);
    }
    
    public void Mostrar()
    { System.out.println("===Rectangulo===\nEl área del rectangulo es: "+Area);
      System.out.println("El perímetro del rectangulo es de: "+Perimetro);
    }
     public void setLados (int Altura, int Base)
    { this.Altura=Altura;
      this.Base=Base;
      Calculos();
    }
}
