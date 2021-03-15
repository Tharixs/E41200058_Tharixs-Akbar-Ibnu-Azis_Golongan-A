/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4_w02;

import java.util.Scanner;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class Latihan4_W02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        buat scannernya 
        Scanner in = new Scanner(System.in);
// ambil nilai dari keyboard 

        System.out.print("Masukkan nama anda :");
        String nama = in.nextLine();
        System.out.print("Msukkan umur anda :");
        int umur = in.nextInt();
        
        System.out.println("nama saya "+nama +" "+"umur saya "+umur);
    }
    
}
