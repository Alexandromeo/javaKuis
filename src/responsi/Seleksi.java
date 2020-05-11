package responsi;
public class Seleksi implements Proto
{
    private double nTulis, nCoding, nWawancara;    
    private String nama;
    private String nim;
    
    public void setName(String nama)
    {
        this.nama = nama;
    }
    
    public void setNIM(String nim)
    {
        this.nim = nim;
    }
    
    public void setTulis(double tulis)
    {
        this.nTulis = tulis;
    }
    
    public void setCoding(double coding)
    {
        this.nCoding =  coding;
    }
    
    public void setWawancara(double wawancara)
    {
        this.nWawancara = wawancara;
    }
    
    public String getName()
    {
        return this.nama;
    }
    
    public String getNIM()
    {
        return this.nim;
    }
    
    public double getTulis()
    {
        return this.nTulis;
    }
    
    public double getCoding()
    {
        return this.nCoding;
    }
    
    public double getWawancara()
    {
        return this.nWawancara;
    }
}
