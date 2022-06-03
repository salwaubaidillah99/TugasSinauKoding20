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
public class Lingkaran extends Tugas3KodingSalwa{
    public void Lingkaran(){     
        double luas,r,keliling,phi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("LINGKARAN");
        System.out.print("Input jari-jari : ");
        r = input.nextDouble();
        luas = phi*r*r;
        keliling = 2*phi*r;
        System.out.println("Luas Lingkaran adalah : "+luas);
        System.out.println("Keliling Lingkaran adalah : "+keliling);
   }
}
