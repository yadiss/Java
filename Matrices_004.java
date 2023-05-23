package matrices_004;
public class Matrices_004 {
public static void main(String[] args) {
    int M1[][] = new int [][]{{4,7,2},{8,5,9},{2,8,9}};
    Mostrar(M1);
    Diagonal(M1);
    Inversa(M1);
    
    int M2[][] = new int [][]{{4,5,7},{3,2,1},{1,1,9},{9,-5,0}};
    Mostrar(M2);
    Diagonal(M2);
    }
    public static void Mostrar(int M[][])
    { System.out.println("--------------------------");
        for(int R=0; R<M.length; R++)
            { for(int C=0; C<M[R].length; C++)
                { System.out.print(M[R][C]+"\t");}
            System.out.println();
            } 
    }
    
    public static void Diagonal(int M[][])
    { System.out.println("--------------------------");
      if (M.length==M[0].length)
      { int Suma=0;
        for(int R=0; R<M.length; R++)
        { for(int C=0; C<M[R].length; C++)
            { if(R==C)
                { Suma += M[R][C];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: "+Suma);
      }
      else
       System.out.println("La matriz no es cuadrada");
    }
    
    public static void Inversa(int M[][])
    { System.out.println("--------------------------");
        for(int R=M.length - 1; R>=0; R--)
            { for(int C=M[R].length - 1; C>=0; C--)
                { System.out.print("["+R+"] ["+C+"] = "+M[R][C]+"\n");}
            } 
        
    }
}
