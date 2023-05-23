package arraylist_002;
public class Producto {
    private String Nombre;
    private double Precio;
    
    public Producto(String Nombre, double Precio)
    { this.Nombre=Nombre; this.Precio=Precio;
    }
    
    public String getNombre()
    { return Nombre;
    }
    
    public double getPrecio()
    { return Precio;
    }
    
    @Override
    public String toString()
    { String Texto = "--------------------------------\n";
      Texto += "Nombre: " + Nombre +"\n";
      Texto += "Precio: " + Precio;
      return Texto;
    }
}
