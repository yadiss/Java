package figuras;

import static java.lang.Math.sqrt;

public class Triangulo_isosceles {
    private int Lado1, Lado2;
    private double Area, Perimetro;
    public Triangulo_isosceles (int Lado1, int Lado2)
    { this.Lado1=Lado1;
      this.Lado2=Lado2;
      Calculos();
    }
    public void Calculos()
    { Area=(Lado1/4)*(Math.sqrt((4*Lado2*Lado2)-(Lado1*Lado1)));
      Perimetro=(Lado1*2)+Lado2; 
    }
    
    public void Mostrar()
    { System.out.println("===Triángulo isósceles===");
      System.out.println("El área es de: "+Area);
      System.out.println("El perímetro es de : "+Perimetro);
    }
    public void setLados (int Lado1, int Lado2)
    { this.Lado1=Lado1;
      this.Lado2=Lado2;
      Calculos();
    }
}
