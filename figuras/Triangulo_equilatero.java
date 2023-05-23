package figuras;
public class Triangulo_equilatero {
    private int Lado;
    private double Altura;
    private double Area;
    private double Perimetro;
    
    public Triangulo_equilatero (int Lado)
    { this.Lado=Lado;
    Calculos();
    }
    
    public void Calculos()
    { Altura=(double) ((Math.sqrt(3)*Lado)/2);
      Area=(Lado*Altura)/2;
      Perimetro=Lado*3;
    }
    
    public void Mostrar()
    { System.out.println("===Triángulo equilatero===\nEl lado mide: "+Lado);
      System.out.println("La altura es de: "+Altura);
      System.out.println("El perímetro del triángulo es de: "+Perimetro);
      System.out.println("El área es de: "+Area);
    }
    
    public void setLado (int Lado)
    { this.Lado = Lado;
      Calculos();
    }
}
