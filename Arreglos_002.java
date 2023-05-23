package arreglos_002;
import java.util.Scanner;
public class Arreglos_002 {
public static void main(String[] args) {
    String Panzones[] = new String[]{"Bolita","Bob","Quaso 1","Quaso 2","Bolito","Solovino"};
    Mostrar(Panzones);
    
    String Streamers[] = new String[]{"Quackity","Roier","Axozer","Mafer","Foolish","George"};
    Mostrar(Streamers);
    
    int Numeros[] = new int[]{1,2,3,4,5,6,7,8,9,10};
    Mostrar(Numeros);
    
    /*double Decimales[] = new double[]{1.1,1.2,1.3};
    Mostrar(Decimales);*/
    Mostrar(new double[]{1.1,1.2,1.3});
    
    Mostrar(LlenarAleatorios(5));
    
    Streamers = Llenar(10);
    Mostrar(Streamers);
}
    public static void Mostrar(String Arr[])
    { System.out.println("============================");
      for(int Pos=0; Pos<Arr.length; Pos++)
       System.out.println("["+(Pos+1)+"] = "+Arr[Pos]);
      
      System.out.println();   
    }
    
    public static void Mostrar(int Arr[])
    { System.out.println("============================");
      for(int Pos=0; Pos<Arr.length; Pos++)
       System.out.println("["+(Pos+1)+"] = "+Arr[Pos]);
      
      System.out.println();   
    }
    
    public static void Mostrar(double Arr[])
    { System.out.println("============================");
      for(int Pos=0; Pos<Arr.length; Pos++)
       System.out.println("["+(Pos+1)+"] = "+Arr[Pos]);
      
      System.out.println();   
    }
    
    public static double[] LlenarAleatorios(int Tamaño)
    { double Arr[] = new double[Tamaño];
      for(int Pos=0; Pos<Arr.length; Pos++)
          Arr[Pos]=Math.random();
      return Arr;
    }
    
    public static String[] Llenar(int Tamaño)
    { String Arr[] = new String[Tamaño];
      System.out.println("-------------------------");
      Scanner Teclado = new Scanner(System.in);
      for(int Pos=0; Pos<Arr.length; Pos++)
      { System.out.print("Dame el valor para ["+(Pos+1)+"] = ");
        Arr[Pos] = Teclado.nextLine();
      }
      return Arr;
    }
    
    public static int[] LlenarInt(int Tamaño)
    { int Arr[] = new int[Tamaño];
      System.out.println("-------------------------");
      Scanner Teclado = new Scanner(System.in);
      for(int Pos=0; Pos<Arr.length; Pos++)
      { System.out.print("Dame el valor para ["+(Pos+1)+"] = ");
        Arr[Pos] = Teclado.nextInt();
      }
      return Arr;
    }
}
