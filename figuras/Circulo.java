package figuras;
public class Circulo {
    private int Radio, Diametro;
    private double  Perimetro, Area;
    public Circulo (int Radio)
    { this.Radio=Radio;
      Calculos();
    }
    
    public void Calculos()
    { Area = Math.PI*Radio*Radio;
      Diametro = Radio+Radio;
      Perimetro= Math.PI*Diametro;
    }
    
    public void Mostrar()
    { System.out.println("===Círculo===\nEl radio mide: "+Radio);
      System.out.println("El diámetro mide: "+Diametro+"\nEl area del círculo mide: "+Area);
      System.out.println("El perímetro del círculo mide: "+Perimetro);
    }
    
    public void setRadio(int Radio)
    { this.Radio=Radio;
      Calculos();
    }
}
