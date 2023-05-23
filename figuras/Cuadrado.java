package figuras;
public class Cuadrado {
  private int Lado, Area, Perimetro;
  public Cuadrado (int Lado)
  { this.Lado=Lado;
    Calculos();
  }
  
  public void Calculos()
  { Area=Lado*Lado;
    Perimetro=Lado*4;
  }
  
  public void Mostrar()
  { System.out.println("===Cuadrado===\nEl área del cuadrado es: "+Area);
    System.out.println("El perímetro del cuadrado es de: "+Perimetro);
  }
  
   public void setLado (int Lado)
    { this.Lado=Lado;
    Calculos();
    }
}
