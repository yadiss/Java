package formula_cuadratica;
import java.util.Scanner;
public class Formula_cuadratica {
public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
    double resultado[]=ecuacion.Ecuacion(1, 1, -6);
    System.out.println("El valor de x1 es: "+resultado[0]+"\nEl valor de x2 es: "+resultado[1]);
    }
    
}
