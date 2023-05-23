package excepciones_001;

import java.util.InputMismatchException;
import java.util.Scanner;
//Los try catch anidados deben venir completos y no cruzados
public class Excepciones_001 {
public static void main(String[] args) {
    try
    { int Num1=5;
      int Num2=5;
      int Num3=Num1/Num2;
      int Arreglo [] = new int []{5,6,7};
      Arreglo[1]=20;
      Scanner Entrada = new Scanner(System.in);
      System.out.println("Dame un número: ");
      Num1=Entrada.nextInt();
    }
    
    catch (InputMismatchException F2) //Un tipo de dato es diferente alñ que se pide
    { System.out.println("Metiste datos incorrectos");
      System.out.println(F2.toString());
      System.out.println(F2.getMessage());
    }        
    catch (ArrayIndexOutOfBoundsException F1)//Posición fuera del arreglo
    { System.out.println("Fallo de acceso");
     System.out.println(F1.toString());
      System.out.println(F1.getMessage());
    }
    catch(ArithmeticException F3)//Syntax error xd
    {
      System.out.println("No debo dividir por cero: "+F3.toString());
    }
    catch (Exception Fallo)//General
    { System.out.println("General: "+Fallo.toString());
        
    }
    finally
    {
        System.out.println("Eso es todo");
    }
  }
    
}
