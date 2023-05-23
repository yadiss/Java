package formula_cuadratica;
public class ecuacion {
   public static double[] Ecuacion(double a, double b, double c)
   { double resultado[]=new double[2];
     resultado[0]=(-b+(Math.sqrt(b*b-4*a*c)))/2*a;
     resultado[1]=(-b-(Math.sqrt(b*b-4*a*c)))/2*a;
     return resultado;
   }
}
