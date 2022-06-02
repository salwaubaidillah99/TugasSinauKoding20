/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1kodingsalwa;

/**
 *
 * @author salwa
 */
public class Tugas1KodingSalwa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         for(int a = 1; a<50; a++){
            if (a % 3 == 0){
                System.out.println("n akan habis dibagi 3");
            } else if (a % 5 == 0){
                System.out.println("n akan habis dibagi 5");
            } else {
                System.out.println(a);
            }
    }
    }
}
