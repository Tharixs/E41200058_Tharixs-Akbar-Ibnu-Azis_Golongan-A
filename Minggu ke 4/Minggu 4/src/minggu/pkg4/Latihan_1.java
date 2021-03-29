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
public class Latihan_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah perulangan = ");
        int x = in.nextInt();
        int i =0;
        
        while (i<x) {  
            int a = 1+i;
            System.out.println("Perulangan while ke "+a);
            i++;
        }
    }
}
