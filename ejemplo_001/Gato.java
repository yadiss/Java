package ejemplo_001;
public class Gato {
    private String Nombre;
    private String Raza;
    private String Sexo;
    private Gato Pareja;
    
    public Gato(String Nombre, String Raza, String Sexo)
    { this.Nombre=Nombre;
      this.Raza = Raza;
      this.Sexo=Sexo;
    }
    
    public void Mostrar()
    {   System.out.println("************");
        System.out.print("Hola soy ");
     if (Sexo.compareToIgnoreCase("Hembra")==0)
         System.out.print("una gatita llamada ");
     else
        System.out.print("un gatito llamado ");
     System.out.println(Nombre+" y soy de raza "+Raza);
     if (Pareja != null)
      System.out.println("Y mi pareja es "+Pareja.getNombre());
    }
    
    public void Maullar()
    { System.out.println(Nombre+" => Miau");
    }
    
    public void Maullar (int Veces)
    { if (Veces>0)
        for(int i=0; i<=Veces; i++)
        { Maullar();
        }
      else
        System.out.println("¡I can't do that");
    }
    
    public String getNombre()
    { return Nombre;
    }
    
    public String getSexo()
    { return Sexo;
    }
    
    public Gato getPareja()
    { return Pareja;
    }
    
    public void setPareja(Gato Pareja)
    { if (Pareja !=null)
        {if (Sexo.compareToIgnoreCase(Pareja.getSexo())==0)
            System.out.println("No se pudo");
         else
            this.Pareja=Pareja;
        }
      else
        {System.out.println("No hay pareja");
        }
    }
}
