/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2kodingsalwa;

import static com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker.check;

/**
 *
 * @author salwa
 */
public class Tugas2KodingSalwa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
         System.out.println("TUGAS KE-2 SINAU KODING");
         System.out.println("SALWA FADILLAH");
         for (int a=1; a<=20;a++)
        {
            int b = 0;
            for(int h=1; h<=a ;h++){
                if(a%h==0)
                    b=b+1;
            }
                if(b==2)
                    System.out.println(a+"  => Bilangan Prima ");
                else
                    System.out.println(a+"  => Bukan Bilangan Prima ");
        }
        System.out.println("\n      SELESAI!    ");
    }
}