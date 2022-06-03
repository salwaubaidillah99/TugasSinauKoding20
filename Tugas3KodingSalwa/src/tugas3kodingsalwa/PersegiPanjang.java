/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3kodingsalwa;

import java.util.Scanner;

/**
 *
 * @author salwa
 */
public class PersegiPanjang extends Tugas3KodingSalwa {
    public void PersegiPanjang(){
        double p,l,luas,keliling;
        Scanner input = new Scanner(System.in);
        System.out.println("Persegi Panjang");
        System.out.print("Input Panjang : ");
        p = input.nextDouble();
        System.out.print("Input Lebar : ");
        l = input.nextDouble();
        luas = p*l;
        keliling = 2*(p+l);
        System.out.println("Luas Persegi Panjang adalah : "+luas);
        System.out.println("Keliling Persegi Panjang adalah : "+keliling);
    }  
}
