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
public class Latihan_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int panjang = in.nextInt();
        int [] Array = new int[panjang];
        
        for (int i = 0; i < panjang; i++) {
            System.out.print("Masukkan Nilai = ");
            Array[i] = in.nextInt();
        }
        System.out.print("Nilai Anda = ");
        for (int i : Array) {
            System.out.print(i + " ");
        }
    }
    
}
