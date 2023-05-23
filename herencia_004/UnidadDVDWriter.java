package herencia_004;
public class UnidadDVDWriter extends UnidadCDWriter implements ILectorDVD, IEscritorDVD {
    private int VelEscDVD, VelLecDVD;
    public UnidadDVDWriter(String Marca, String Modelo, int Anio, int VelLectCD, int VelEscCD, int VelEscDVD, int VelLecDVD) 
    {   super(Marca, Modelo, Anio, VelLectCD, VelEscCD);
        this.VelEscDVD=VelEscDVD; 
        this.VelLecDVD=VelLecDVD;
    }
    //Set
    public void setVelEscDVD (int VelEsctDVD)
    { this.VelEscDVD=VelEscDVD;}
    public void setVelLecDVD(int VelLectDVD) 
    { this.VelLecDVD = VelLecDVD;}
    //Get
    public int getVelEscDVD()
    { return this.VelEscDVD;}
    public int getVelLecDVD()
    { return this.VelLecDVD;}

    @Override
    public void LeerDVD() 
    { System.out.println("Leyendo DVD a "+getVelLecDVD()+"X.");}

    @Override
    public void EscribirDVD() 
    { System.out.println("Escribiendo DVD a "+getVelEscDVD()+"X.");}
    
    @Override
    public String toString()
    { String text = "";
      text += super.toString()+"\n";
      text += "Velocidad de lectura DVD\t: "+getVelLecDVD()+"X\n";
      text += "Velocidad de Escritura DVD\t: "+getVelEscDVD()+"X";
      return text;
    }
    
}
