/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4kodingsalwa;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;
/**
 *
 * @author salwa
 */
public class TugasKoding4Salwa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        boolean lanjut = true;
            
        Scanner input = new Scanner(System.in);
        while(lanjut) {
            System.out.println("===== MENGHITUNG LUAS DAN KELILING BANGUN DATAR =====");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("Pilih bangun datar yang akan diketahui luas dan kelilingnya: ");
            int pilihan = input.nextInt();

            System.out.println("Pilih menghitung luas atau keliling: ");
            System.out.println("1. Hitung luas");
            System.out.println("2. Hitung keliling");
            System.out.println("=> ");
            int pilihan2 = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan sisi: ");
                    double sisi = input.nextDouble();
                    Persegi persegi = new Persegi(sisi);

                    if (pilihan2 == 1) {
              
                        System.out.println("Luas persegi: " + persegi.Luas());
                    } else if (pilihan2 == 2) {
                        System.out.println("Keliling persegi: " + persegi.Keliling());
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                    break;
                case 2:
                    System.out.println("Masukkan panjang: ");
                    double panjang = input.nextDouble();
                    System.out.println("Masukkan lebar: ");
                    double lebar = input.nextDouble();
                    
                    PersegiPanjang persegipanjang = new PersegiPanjang(panjang,lebar);
                    
                    if (pilihan2 == 1) {
                        
                        System.out.println("Luas persegi panjang: " + persegipanjang.Luas());
                    } else if (pilihan2 == 2) {
                        System.out.println("Keliling persegi panjang: " + persegipanjang.Keliling());
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                    break;
                case 3:
                    System.out.println("Masukkan alas: ");
                    double alas = input.nextDouble();
                    System.out.println("Masukkan tinggi: ");
                    double tinggi = input.nextDouble();
                    System.out.println("Masukkan sisi: ");
                    double sisi1 = input.nextDouble();
                    
                    Segitiga segitiga = new Segitiga(alas,tinggi,sisi1);

                    if (pilihan2 == 1) {
                        System.out.println("Luas segitiga: " + segitiga.Luas());
                    } else if (pilihan2 == 2) {
                        System.out.println("Keliling segitiga: " + segitiga.Keliling());
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                    break;
                case 4:
                    System.out.println("Masukkan jari-jari: ");
                    double jari_jari = input.nextDouble();
                    
                    Lingkaran lingkaran = new Lingkaran(jari_jari);
                    
                    if (pilihan2 == 1) {
                        System.out.println("Luas lingkaran: " + lingkaran.Luas());
                    } else if (pilihan2 == 2) {
                        System.out.println("Keliling lingkaran: " + lingkaran.Keliling());
                    } else {
                        System.out.println("Pilihan tidak tersedia");
                    }
                    break;
             
        
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
            System.out.println("Apakah anda ingin menghitung lagi? (y/n)");
            String lanjut2 = input.next();
            if (lanjut2.equals("y")) {
                lanjut = true;
            } else {
                lanjut = false;
            }
        }
        input.close();
    }
}

class Lingkaran extends HitungBangunDatar_abstrak{
        private double r;
        
        public Lingkaran(double jari_jari){
            r= jari_jari;
        }
        
        public double Luas() {
            return ((22*r*r)/7);  
        }

        public double Keliling() {
            return ((2*22*r)/7);
        }
    }
class Persegi extends HitungBangunDatar_abstrak {

    private double s;
        public Persegi(double sisi) {
            s= sisi;
        }

        public double Luas() {
            
            //System.out.println("Luas Persegi = "+(s*s)); //To change body of generated methods, choose Tools | Templates.
            return (s*s);
        }

        public double Keliling() {
            //System.out.println("Keliling Persegi = "+(4*s));
            return (4*s);

    }
}

class Segitiga extends HitungBangunDatar_abstrak {
        private double x,a,t;
        public Segitiga(double sisi, double alas, double tinggi) {
             x = sisi;
             a = alas;
             t = tinggi;
        }

        public double Luas() {
            //System.out.println("Luas Segitiga = "+((a*t)/2)); //To change body of generated methods, choose Tools | Templates.
            return ((a*t)/2);
        }

        public double Keliling() {
           //System.out.println("Keliling Segitiga = "+(x+x+x)); //To change body of generated methods, choose Tools | Templates.
           return (x+x+x);
    }
}

class PersegiPanjang extends HitungBangunDatar_abstrak{
    private double p,l;

   public PersegiPanjang(double panjang, double lebar) {
        p = panjang;
        l = lebar ;
   }

   public double Luas() {
       return (p*l);
   }

   public double Keliling() {
      //System.out.println("Luas Persegi = "+(2*(p+l))); //To change body of generated methods, choose Tools | Templates.
    return (2*(p+l));
   }
}

