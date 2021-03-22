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
public class W03_Latihan_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int grade;
        System.out.print("Masukkan Nilai anda :");
        grade = in.nextInt();
        if (grade >= 90) {
            System.out.println("A");
        }
        else if (grade >= 80) {
            System.out.println("B+");
        }
        else if (grade >= 70) {
            System.out.println("B");
        }
        else if (grade >= 60) {
            System.out.println("C+");
        }
        else if (grade >= 50) {
            System.out.println("C");
        }
        else if (grade >= 40) {
            System.out.println("D");
        }else {
            System.out.println("tidak lulus / E");
        }
    }
}
