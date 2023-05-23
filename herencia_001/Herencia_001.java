package herencia_001;
public class Herencia_001 {
public static void main(String[] args) {
   Persona Per1 = new Persona("Yadiss", "Coca García", 18);
   Per1.Mostrar();
   Estudiante E1 = new Estudiante("22220908","Yadiss","Coca García",18,"ITP","Tic's");
   E1.Mostrar();
   Empleado Em1 = new Empleado("Omar", "García Martínez",37,"Gerente","Comex",5500.50);
   Em1.Mostrar();
    }
    
}
