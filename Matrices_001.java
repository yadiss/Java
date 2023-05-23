package matrices_001;
public class Matrices_001 {
public static void main(String[] args) {
 int M1 [][] = new int [][] {{4,8},{9,1},{10,5}};
 System.out.println(M1[0][1]);
 System.out.println(M1[2][1]); 
 System.out.println(M1[1][0]);
 System.out.println("--------------------------");
              //M1.length da la longitud de los renglones
 for(int R=0; R<M1.length; R++)
                  //M1[R].length da la longitud de las columnas
 { for(int C=0; C<M1[R].length; C++)
    { System.out.println("["+R+"] ["+C+"] = "+M1[R][C]);}
 }
 
 System.out.println("--------------------------");
 for(int R=0; R<M1.length; R++)
 { for(int C=0; C<M1[R].length; C++)
    { System.out.print(/*"["+R+"] ["+C+"] = "+*/M1[R][C]+"\t");}
    System.out.println();
 }
 
 System.out.println("--------------------------");
 System.out.println(M1.length*M1[0].length);
}    
}
