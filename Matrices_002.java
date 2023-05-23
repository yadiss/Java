package matrices_002;
import java.util.Scanner;
public class Matrices_002 {
public static void main(String[] args) {
    int M2 [][] = new int [3][4];
    Scanner Teclado = new Scanner(System.in);
    for(int R=0; R<M2.length; R++)
    { for(int C=0; C<M2[R].length; C++)
        { System.out.print("Dame el valor para ["+R+"]["+C+"]: ");
          M2[R][C]=Teclado.nextInt();
        }
    }
    
    System.out.println("--------------------------");
    for(int R=0; R<M2.length; R++)
    { for(int C=0; C<M2[R].length; C++)
        { System.out.print(/*"["+R+"] ["+C+"] = "+*/M2[R][C]+"\t");}
        System.out.println();
    }
  }  
}
