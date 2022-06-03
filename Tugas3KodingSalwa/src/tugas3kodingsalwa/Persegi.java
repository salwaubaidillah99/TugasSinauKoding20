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
public class Persegi extends  Tugas3KodingSalwa {
    public void Persegi() {
        double s,luas,keliling;
        Scanner input = new Scanner(System.in);
        System.out.println("Persegi");
        System.out.print("Input Sisi : ");
        s= input.nextDouble();
        luas = s*s;
        keliling = 4*s;
        System.out.println("Luas Persegi Panjang adalah : "+luas);
        System.out.println("Keliling Persegi Panjang adalah : "+keliling);
    }  
}

