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
public class W03_Tugas_3 {
    public static void main(String[] args) {
        int[][] Value = {
            {5, 6, 1, 7},
            {8, 1, 2, 9},
            {5, 4, 7, 1},
            {8, 3, 7, 5}
        };
        
        for (int[] Nilai : Value) {
            System.out.print("");
            for (int j = 0; j < Value.length; j++) {
                System.out.print(Nilai[j] + " ");
            }
            System.out.println(" ");
        }
    }
}
       
    
            

