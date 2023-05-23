package entrada_001;
import java.util.Scanner;
public class Entrada_001 {
public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
    System.out.print("Give your name: ");
    String Name = Teclado.nextLine();
    System.out.println("Hola, "+Name);
    System.out.print("¿Cuál es tu edad? ");
    int Edad = Teclado.nextInt();
    System.out.println(Name+" tiene "+Edad+" años");
    System.out.print("¿Cuánto mides en metros? ");
    double Estatura = Teclado.nextDouble();
    System.out.println(Name+" mide "+Estatura+" m.");
    
    }
    
}