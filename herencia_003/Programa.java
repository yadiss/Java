/*
Yadira García Coca | 22220908
*/
package herencia_003;
public class Programa {
public static void main(String[] args) {
    System.out.println("---------------Película---------------");
    Pelicula P1 = new Pelicula("Sing Street","HBO",2016);
    P1.setSaga("No");
    System.out.println(P1.getSaga());
    P1.Palomitas();
    P1.Pausar();
    
    System.out.println("\n---------------Serie---------------");
    Serie S1 = new Serie("The Owl House","Disney Plus",2020);
    S1.setTemporadas(3);
    System.out.println(S1.getTemporadas());
    S1.Intro();
    S1.Siguiente();
    
    System.out.println("\n---------------Documental---------------");
    Documental D1 = new Documental ("La ciudad oculta","Film in",2018);
    D1.setTipo("poético");
    System.out.println(D1.getTipo());
    D1.Reproducir();
    D1.Informacion();
    }
}
