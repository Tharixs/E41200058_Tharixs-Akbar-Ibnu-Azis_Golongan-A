/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu.pkg4;

import java.util.Scanner;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class Tugas_2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Batas Nilai = ");
        int batas = in.nextInt();
        System.out.println("");
        System.out.println("         do_while");
        System.out.print("Bilangan kelipatan (2 - "+batas +")");
        System.out.println("");
        int i = 1;
        do {
           System.out.print(i+" ");  
           i=i*2; 
        } while (i < batas);
    }
}
