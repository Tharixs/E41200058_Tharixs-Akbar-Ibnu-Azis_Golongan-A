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
public class Latihan_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        System.out.println("Masukkan jumlah perulangan = ");
        int x = in.nextInt();
        
        do {  
            int a = i +1;
            System.out.println("Perulangan do ke "+a); 
            i++;
            } while (i<x);
    }
}
