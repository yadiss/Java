package herencia_004;
//No se necesitan crear instancias
public abstract class UnidadOptica 
{  private String Marca, Modelo;
   private int Anio;
   //Constructor
   public UnidadOptica(String Marca, String Modelo, int Anio)
   { this.Marca=Marca; this.Modelo=Modelo; this.Anio=Anio;}
   //Set
   public void setModelo(String Modelo)
   { this.Modelo=Modelo;}
   public void setMarca(String Marca)
   { this.Marca=Marca;}
   public void setAnio(int Anio)
   { this.Anio=Anio;}
   //Get
   public String getModelo()
   { return this.Modelo;}
   public String getMarca()
   { return this.Marca;}
   public int getAnio()
   { return this.Anio;}
   //To string
   @Override
   public String toString()
   { String Texto = "";
     Texto += "Clase\t: "+this.getClass().getName()+"\n";
     Texto += "Marca\t: "+getMarca()+"\n";
     Texto += "Modelo\t: "+getModelo()+"\n";
     Texto += "Año\t: "+getAnio();
     return Texto;
   }
}