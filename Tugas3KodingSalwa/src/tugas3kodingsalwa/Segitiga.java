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
public class Segitiga extends Tugas3KodingSalwa {
    public void Segitiga(){
        double luas,keliling,alas,tinggi,sisi; 
        Scanner input = new Scanner(System.in); 
        System.out.println("SEGITIGA");
        System.out.print ("Input alas : "); 
        alas = input.nextDouble();                     
        System.out.print ("Input tinggi :");  
      tinggi = input.nextDouble();                    
        System.out.print ("Input sisi : ");   
        sisi = input.nextDouble();
        luas = (alas*tinggi)/2;    
        keliling = (sisi*2)+alas; 
        System.out.println("----------------------------------"); 
        System.out.println("Luas Segitiga adalah : "+luas); 
        System.out.println("Keliling Segitiga adalah : "+keliling);
       
    
    }
    
}
