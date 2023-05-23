package excepciones_002;

import javax.swing.JOptionPane;

public class Excepciones_002 {
public static void main(String[] args) {

    int Num1=0, Num2=0, Num3;
    try
    { boolean Posible;
      do
      { Posible=false;
        try
        { String Valor=JOptionPane.showInputDialog("Dame un número:");
          Num1=Integer.parseInt(Valor);
        } 
        catch (Exception E2)
        { Posible=true;
        }
      }
      while(Posible);
      do
      { Posible=false;
        try
        { String Valor=JOptionPane.showInputDialog("Dame otro número:");
          Num2=Integer.parseInt(Valor);
        } 
        catch (Exception E2)
        { Posible=true;
        }
      }
      while(Posible);
      Num3=Num1/Num2;
      JOptionPane.showMessageDialog(null,"Resultado: "+Num3);
    }
    catch (Exception E1)
    { JOptionPane.showMessageDialog(null,"División por 0");
    }
  }
    
}
