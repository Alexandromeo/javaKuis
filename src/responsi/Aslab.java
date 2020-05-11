package responsi;
public class Aslab extends Seleksi 
{
    private double nMicro;
    
    public void setName(String nama)
    {
        super.setName(nama);
    }
    
    public void setNIM(String nim)
    {
        super.setNIM(nim);
    }
    
    public void setTulis(double tulis)
    {
        super.setTulis(tulis);
    }
    
    public void setCoding(double coding)
    {
        super.setCoding(coding);
    }
    
    public void setWawancara(double wawancara)
    {
        super.setWawancara(wawancara);
    }
    
    public void setMicro(double micro)
    {
        this.nMicro = micro;
    }
    
    @Override
    public double getTulis()
    {
        return super.getTulis();
    }
    
    @Override
    public double getCoding()
    {
        return super.getCoding();
    }
    
    @Override
    public double getWawancara()
    {
        return super.getWawancara();
    }
    
    public double getMicro()
    {
        return this.nMicro;
    }
    
    public double getMean()
    {
       return (this.getTulis()+this.getCoding()+this.getWawancara()+this.getMicro())/4;
    }
}
