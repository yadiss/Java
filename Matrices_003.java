package matrices_003;
import java.util.Scanner;
public class Matrices_003 {
public static void main(String[] args) {
    int M3 [][][] = new int [2][3][4];
    Scanner Teclado = new Scanner(System.in);
    for(int R=0; R<M3.length; R++)
    { for(int C=0; C<M3[R].length; C++)
        { for(int A=0; A<M3[R][C].length; A++)
            { System.out.print("Dame el valor para ["+R+"]["+C+"]["+A+"]: ");
              M3[R][C][A]=Teclado.nextInt();
            }
        }
    }
    for(int R=0; R<M3.length; R++)
    { for(int C=0; C<M3[R].length; C++)
        { for(int A=0; A<M3[R][C].length; A++)
            { System.out.println("["+R+"]["+C+"]["+A+"] = "+M3[R][C][A]);}
        }
    }
 }
}
