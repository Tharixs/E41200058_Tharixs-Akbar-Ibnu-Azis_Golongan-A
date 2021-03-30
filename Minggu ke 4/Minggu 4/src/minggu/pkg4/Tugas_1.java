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
public class Tugas_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai terkecil = ");
        int F = in.nextInt();
        System.out.print("Masukkan nilai terbesar = ");
        int L = in.nextInt();
        
        System.out.print("Urutan bilangan genap anda = ");
        for (int i = F; i < L; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");

            }
        }

    }

}
