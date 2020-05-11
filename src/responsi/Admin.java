package responsi;
public class Admin extends Seleksi 
{
    private double nJaringan;
    
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
    
    public void setJaringan(double jaringan)
    {
        this.nJaringan = jaringan;
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
    
    public double getJaringan()
    {
        return this.nJaringan;
    }
    
    public double getMean()
    {
       return (this.getTulis()+this.getCoding()+this.getWawancara()+this.getJaringan())/4;
    }
}
