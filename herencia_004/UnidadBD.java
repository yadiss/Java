package herencia_004;
public class UnidadBD extends UnidadDVD implements ILeerBD {
    private int VelLecBD;
    public UnidadBD(String Marca, String Modelo, int Anio, int VelLectCD, int VelLectDVD, int VelLecBD) 
    { super(Marca, Modelo, Anio, VelLectCD, VelLectDVD);
      this.VelLecBD=VelLecBD;
    }
    //Set
    public void setVelLecBD(int VelLecBD)
    { this.VelLecBD=VelLecBD;}
    //Get
    public int getVelLecBD()
    { return this.VelLecBD;}

    @Override
    public void LeerBD() 
    { System.out.println("Leyendo BD a "+getVelLecBD()+"X.");}
    
    @Override
    public String toString()
    { String text = "";
      text += super.toString()+"\n";
      text += "Velocidad de lectura BD\t: "+getVelLecBD()+"X\n";
      return text;
    }
    
}
