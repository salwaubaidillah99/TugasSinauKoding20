/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3kodingsalwa;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.T;
import static javafx.scene.input.KeyCode.Y;

/**
 *
 * @author salwa
 */
public class Tugas3KodingSalwa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pil; //variable pil, dengan tipe data integer
        Persegi P = new Persegi();
        PersegiPanjang PP = new PersegiPanjang();
        Lingkaran L = new Lingkaran();
        Segitiga S = new Segitiga();
        
        Scanner input = new Scanner(System.in);
       for (String x="y"; x.equals("y")||x.equals("y");){ 
        System.out.println(" LUAS BANGUN DATAR DAN KELILING ");     
        System.out.println(" Input Pilihan untuk Menghitung Bangun Datar ");
         System.out.println("");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang ");     
        System.out.println("3. Segitiga");     
        System.out.println("4. Lingkaran");
        System.out.println("5. Keluar");
        System.out.print("");
        System.out.print("Pilihan : ");
        pil = input.nextInt();
                  switch(pil){ //metode switch case untuk menentukan ingin menghitung bangun datar apa
            case 1 : P.Persegi();break;
            case 2 : PP.PersegiPanjang();break;
            case 3 : S.Segitiga();break;
            case 4 : L.Lingkaran();break;
            case 5 : System.exit(0);
        }
            System.out.println();
            System.out.print("Tekan (Y) untuk Menghitung Bangun Datar Yang Lain / (T) untuk keluar : ");
            x = input.next(); //inputan keputusan
        }
        }
}
    
    

