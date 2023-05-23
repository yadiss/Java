package herencia_004;
public class UnidadDVD extends UnidadCD implements ILectorDVD{
    private int VelLectDVD;
    public UnidadDVD(String Marca, String Modelo, int Anio, int VelLectCD, int VelLectDVD) 
    { super(Marca, Modelo, Anio, VelLectCD);
      this.VelLectDVD=VelLectDVD;
    }
    //Set
    public void setLectDVD(int VelLectDVD)
    { this.VelLectDVD=VelLectDVD;}
    //Get
    public int getLectDVD()
    { return VelLectDVD;}
    
    @Override
    public void LeerDVD() 
    { System.out.println("Leyendo DVD a "+getLectDVD()+"X.");}
    
    @Override
    public String toString()
    { String text = "";
      text += super.toString()+"\n";
      text += "Velocidad de lectura de DVD\t: "+getLectDVD()+"X.";
      return text;
    }
}
