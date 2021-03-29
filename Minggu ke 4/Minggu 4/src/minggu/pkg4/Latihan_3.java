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
public class Latihan_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int i = in.nextInt();
        for ( ;i > 0; i--) {
            for (int j = 0; j < i; j++) {
            System.out.print("*");
            }
            System.out.println(" ");
            
            
        }
    }
}
