package responsi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Responsi 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String name, nim, labelNilai;
        int menu, total;
        int tulis, coding, wawancara, tambahan;
        System.out.println("Menu Seleksi Penerimaan Admin dan Aslab");
        System.out.println("1. Aslab");
        System.out.println("2. Admin");
        System.out.print("Pilih :");
        try
        {
            menu = input.nextInt();
            labelNilai = menu == 1 ? "Microteaching" : "Praktik Jaringan";
            System.out.print("Masukkan jumlah data : ");
            try
            {
                total = input.nextInt();
                int i = 0;
                while(i<total)
                {   
                    System.out.println("\tData ke-"+(i+1));
                    System.out.print("\t\tNama : ");
                    input.nextLine();
                    name = input.nextLine();
                    System.out.print("\t\tNIM : ");
                    nim = input.nextLine();
                    System.out.print("\t\tNilai Tulis : ");
                    tulis = input.nextInt();
                    System.out.print("\t\tNilai Coding : ");
                    coding = input.nextInt();
                    System.out.print("\t\tNilai Wawancara : ");
                    wawancara = input.nextInt();
                    System.out.print("\t\tNilai "+labelNilai+" : ");
                    tambahan = input.nextInt();

                    switch(menu)
                    {
                        case 1:
                            Aslab as = new Aslab();
                            as.setName(name);
                            as.setNIM(nim);
                            as.setTulis(tulis);
                            as.setCoding(coding);
                            as.setWawancara(wawancara);
                            as.setMicro(tambahan);
                            System.out.println("Detail Kandidat");
                            System.out.println("Nama : "+as.getName());
                            System.out.println("NIM : "+as.getNIM());
                            System.out.println("Nilai Tulis : "+as.getTulis());
                            System.out.println("Nilai Coding : "+as.getCoding());
                            System.out.println("Nilai Wawancara : "+as.getWawancara());
                            System.out.println("Nilai Microteaching : "+as.getMicro());
                            System.out.println("Nilai Rerata : "+as.getMean());
                            if(as.getMean() >= 85)
                            {
                                System.out.println("Selamat, Anda lolos menjadi aslab");
                            }
                            else
                                System.out.println("Maaf, Anda tidak lolos menjadi aslab");
                            System.out.println("\n\n");
                            break;
                        case 2:
                            Admin ad = new Admin();
                            ad.setName(name);
                            ad.setNIM(nim);
                            ad.setTulis(tulis);
                            ad.setCoding(coding);
                            ad.setWawancara(wawancara);
                            ad.setJaringan(tambahan);
                            System.out.println("Detail Kandidat");
                            System.out.println("Nama : "+ad.getName());
                            System.out.println("NIM : "+ad.getNIM());
                            System.out.println("Nilai Tulis : "+ad.getTulis());
                            System.out.println("Nilai Coding : "+ad.getCoding());
                            System.out.println("Nilai Wawancara : "+ad.getWawancara());
                            System.out.println("Nilai Jaringan : "+ad.getJaringan());
                            System.out.println("Nilai Rerata : "+ad.getMean());
                            if(ad.getMean() >= 85)
                            {
                                System.out.println("Selamat, Anda lolos menjadi admin");
                            }
                            else
                                System.out.println("Maaf, Anda tidak lolos menjadi admin");
                            System.out.println("\n\n");
                            break;
                    }
                    
                    i-=-1;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Input harus berupa angka");
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Input harus berupa angka");
        }
    }
    
}
