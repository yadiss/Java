package herencia_004;
public class UnidadBDWriter extends UnidadDVDWriter implements IEscritorBD, ILeerBD{
    private int VelLecBD, VelEscBD;
    public UnidadBDWriter(String Marca, String Modelo, int Anio, int VelLectCD, int VelEscCD, int VelEscDVD, int VelLecDVD, int VelLecBD, int VelEscBD) 
    {   super(Marca, Modelo, Anio, VelLectCD, VelEscCD, VelEscDVD, VelLecDVD);
        this.VelEscBD=VelEscBD; this.VelLecBD=VelLecBD;
    }
    //Set
    public void setVelLecBD(int VelLecBD)
    { this.VelLecBD=VelLecBD;}
    public void setVelEscBD(int VelEscBD)
    { this.VelEscBD=VelEscBD;}
    //Get
    public int getVelLecBD()
    { return this.VelLecBD=VelLecBD;}
    public int getVelEscBD()
    { return this.VelEscBD=VelEscBD;}
    
    @Override
    public void EscribirBD() 
    { System.out.println("Leyendo DVD a "+getVelLecBD()+"X.");}

    @Override
    public void LeerBD() 
    { System.out.println("Escribiendo BD a "+getVelLecBD()+"X.");}
    
    @Override
    public String toString()
    { String text = "";
      text += super.toString()+"\n";
      text += "Velocidad de lectura BD\t: "+getVelLecBD()+"X\n";
      text += "Velocidad de Escritura BD\t: "+getVelEscBD()+"X";
      return text;
    }
}
