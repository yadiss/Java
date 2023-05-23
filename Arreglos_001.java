package arreglos_001;
import java.util.Scanner;
public class Arreglos_001 {
public static void main(String[] args) {
    //Arreglo vacío
    String Frutas[] = new String[5];
    System.out.println(Frutas[1]);//nulo
    
    //Arreglo lleno
    String Michis[] = new String [] {"Monchis","Pelusa","Ana Perla","Yeyo","Bigotes","Sr. Estroncio"};
    
    //Imprimir arreglos de forma individual
    System.out.println("\nNombres de Michis =^.^=");
    System.out.println(Michis[0]);
    System.out.println(Michis[1]);
    System.out.println(Michis[2]);
    System.out.println(Michis[3]);
    System.out.println(Michis[4]);
    System.out.println(Michis[5]);
    
    //Imprimir arreglos con cilo For 1
    System.out.println("\nNombres de Michis =^.^=");
    for (int Pos=0; Pos<Michis.length; Pos++)
        System.out.println((Pos+1)+" "+Michis[Pos]);
    
    //Imprimir arreglos con cilo For 2
    System.out.println("\nNombres de Michis =^.^=");
    for(String Michi:Michis)
        System.out.println(Michi);
    
    System.out.println("\n");
    Scanner Teclado = new Scanner(System.in);
    for(int Pos=0; Pos<Frutas.length; Pos++)
     { System.out.print("Dame la fruta "+(Pos+1)+": ");
       Frutas[Pos] = Teclado.nextLine();
     }
    System.out.println("\nNombres de frutas");
    for(int Pos=0; Pos<Frutas.length; Pos++)
     { System.out.println((Pos+1)+". "+Frutas[Pos]);
     }
    
    }   
}
