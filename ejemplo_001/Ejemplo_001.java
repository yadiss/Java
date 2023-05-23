package ejemplo_001;
public class Ejemplo_001 {
public static void main(String[] args) {
    Libro L1 = new Libro();
    L1.setTitulo("Boulevard");
    L1.Mostrar();
    L1.setAutor("Flor Salvador");
    L1.Mostrar();
    Libro L2 = new Libro("Nada", "Jenn Teller");
    L2.Mostrar();
    
    Gato G1 = new Gato("Monchis", "Gris","Macho");
    Gato G2 = new Gato("Lia", "Siámes","Hembra");
    G1.Mostrar();
    G2.Mostrar();
    G1.Maullar(2);
    G2.Maullar(3);
    G2.Mostrar();
    
    }
    
}
