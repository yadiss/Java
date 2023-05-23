package figuras;
import java.util.Scanner;
public class Figuras {
 public static void main(String[] args) {
    Scanner Teclado = new Scanner (System.in);
    int Opcion;
    do{
    System.out.println("Escribe el número de opción que deseas:"
            + "\n1. Triángulo isosceles\n2. Cuadrado\n3. Rectángulo"
             +"\n4. Rectángulo equilatero\n5. Circulo\n6. Salir");
    Opcion=Teclado.nextInt(); 
    switch (Opcion){
        case 1: System.out.println("Introduce el valor del lado A: "); int LadoA=Teclado.nextInt();
                  System.out.println("Introduce el valor del lado B: "); int LadoB=Teclado.nextInt();
                  Triangulo_isosceles T1 = new Triangulo_isosceles(LadoA,LadoB); T1.Mostrar();
                  System.out.println("Introduce el valor del nuevo lado A: "); int LadoAs=Teclado.nextInt();
                  System.out.println("Introduce el valor del nuevo lado B: "); int LadoBs=Teclado.nextInt();
                  T1.setLados(LadoAs,LadoBs); T1.Mostrar(); break;
        case 2: System.out.println("Introduce el valor del lado: "); int Lado=Teclado.nextInt();
                  Cuadrado C1 = new Cuadrado(Lado); C1.Mostrar();
                  System.out.println("Introduce el valor del nuevo lado: "); int LadoS=Teclado.nextInt();
                  C1.setLado(LadoS); C1.Mostrar(); break;
        case 3: System.out.println("Introduce el valor de la base: "); int Base=Teclado.nextInt();
                  System.out.println("Introduce el valor de la altura: "); int Altura=Teclado.nextInt();
                  Rectangulo R1 = new Rectangulo(Base,Altura);  R1.Mostrar();
                  System.out.println("Introduce el nuevo valor de la base: "); int BaseS=Teclado.nextInt();
                  System.out.println("Introduce el  nuevovalor de la altura: "); int AlturaS=Teclado.nextInt();
                  R1.setLados(AlturaS, BaseS); R1.Mostrar(); break;
        case 4: System.out.println("Introduce el valor del lado: "); int LadoT=Teclado.nextInt();
                  Triangulo_equilatero TE1 = new Triangulo_equilatero(LadoT); TE1.Mostrar();
                  System.out.println("Introduce el nuevo valor del lado: "); int LadoTs=Teclado.nextInt();
                  TE1.setLado(LadoTs); TE1.Mostrar(); break;
        case 5: System.out.println("Escribe el valor del radio: "); int Radio=Teclado.nextInt();
                   Circulo Cir1 = new Circulo(Radio); Cir1.Mostrar();
                   System.out.println("Escribe el nuevo valor del radio: "); int RadioS=Teclado.nextInt();
                   Cir1.setRadio(RadioS); Cir1.Mostrar(); break;
       }
     }
    while (Opcion!=6);
   } 
}
