package archivos_001;
import java.io.File;
public class Archivos_001 {
    public static void main(String[] args) {
    File f1 =new File("E:\\poliza.pdf");
    File f2 = new File("E:\\");
    System.out.println("¿Directorio? "+f1.isDirectory());
    System.out.println("¿Archivo? "+f1.isFile());
    System.out.println("Ruta absoluta: "+f1.getAbsolutePath());
    System.out.println("Nombre: "+f1.getName());
    System.out.println("Tamaño "+f1.length());
    System.out.println("----------------------------");
    System.out.println("¿Directorio? "+f2.isDirectory());
    System.out.println("¿Archivo? "+f2.isFile());
    System.out.println("Ruta absoluta "+f2.getAbsolutePath());
    System.out.println("Nombre: "+f2.getName());
    System.out.println("Tamaño: "+f2.length()+" bytes");
    System.out.println("Tamaño disponible: "+f2.getFreeSpace()+" bytes");
    System.out.println("Tamaño total: "+f2.getTotalSpace()+" bytes");
    }
    
}
