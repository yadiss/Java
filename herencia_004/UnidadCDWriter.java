package herencia_004;
public class UnidadCDWriter extends UnidadOptica implements ILectorCD, IEscritorCD {
    private int VelLectCD, VelEscCD;
    public UnidadCDWriter(String Marca, String Modelo, int Anio, int VelLectCD,int VelEscCD) 
    { super(Marca, Modelo, Anio);
      this.VelLectCD=VelLectCD;
      this.VelEscCD=VelEscCD;
    }
    //Set
    public void setVelLectCD(int VelLectCD)
    { this.VelLectCD=VelLectCD;}
    public void setVelEscCD(int VelEsctCD)
    { this.VelEscCD=VelEsctCD;}
    //Get
    public int getVelLectCD()
    { return this.VelLectCD;}
    public int getVelEscCD()
    { return this.VelEscCD;}
    
    @Override
    public void LeerCD() 
    { System.out.println("Leyendo CD a "+getVelLectCD()+"X.");}

    @Override
    public void EscribirCD() 
    { System.out.println("Escribiendo CD a "+getVelLectCD()+"X.");}
    
    @Override
    public String toString()
    { String text = "";
      text += super.toString()+"\n";
      text += "Velocidad de lectura CD\t: "+getVelLectCD()+"X\n";
      text += "Velocidad de Escritura CD\t: "+getVelEscCD()+"X";
      return text;
    }
}
