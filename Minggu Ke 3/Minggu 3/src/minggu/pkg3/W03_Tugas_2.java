/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu.pkg3;

import java.util.Scanner;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class W03_Tugas_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Maukkan Panjang Array Anda : ");
        int PanjangArray = in.nextInt();
        int NilaiArray[] = new int[PanjangArray];
        System.out.print("Array anda : {");
        for (int j = 0; j < PanjangArray; j++) {
            NilaiArray[j] = (int) (Math.random()*15+1);
            System.out.print(NilaiArray[j] + " ");
        }
        System.out.println("}");

    }
}
