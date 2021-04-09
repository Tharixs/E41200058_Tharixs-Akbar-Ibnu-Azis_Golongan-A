/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu.pkg4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class Tugas_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int data;

        System.out.print("Masukkan banyak data = ");
        data = in.nextInt();
        int[] Arr = new int[data];

        for (int i = 0; i < data; i++) {
            int a = 1 + i;
            System.out.print("Masukkan Data Nilai ke " + a + " = ");
            Arr[i] = in.nextInt();
        }
        Arrays.sort(Arr);

        int Max = Arr[0];
        int Min = Arr[0];
        double Hasil = 0;
        double Rata = 0;
        
        for (int i = 0; i < Arr.length; i++) {
            System.out.print( " ");

            if (Max < Arr[i]) {
                Max = Arr[i];
            } else {
                Min = Arr[i];
            }
            double Jumlah = Arr[i];
            Rata += Jumlah;
            Hasil = Rata / Arr.length;
        }

        System.out.println("");

        System.out.println("Nilai MAXIMUM = " + Max);
        System.out.println("Nilai MINIMUM = " + Min);
        System.out.println("Nilai Rata Rata = " + Hasil);
    }
}
