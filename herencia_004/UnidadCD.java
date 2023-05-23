package herencia_004;

public class UnidadCD extends UnidadOptica implements ILectorCD
{   private int VelLectCD;  

    public UnidadCD(String Marca, String Modelo, int Anio, int VelLectCD) 
    { super(Marca, Modelo, Anio);
      this.VelLectCD=VelLectCD;
    }
    
    public int getVelLectCD()
    { return this.VelLectCD; 
    }
    public void setVelLectCD(int VelLectCD)
    { this.VelLectCD=VelLectCD;
    }
    @Override
    public String toString()
    { String Text = "";
      Text += super.toString()+"\n";
      Text += "Velocidad de lectura CD\t: "+getVelLectCD();
      return Text;
    }
    @Override
    public void LeerCD() {
        System.out.println("Leyendo CD a "+getVelLectCD()+"X.");
    }    
}