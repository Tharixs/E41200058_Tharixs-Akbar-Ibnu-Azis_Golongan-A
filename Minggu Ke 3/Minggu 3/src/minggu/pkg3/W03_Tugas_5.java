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
public class W03_Tugas_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("      CAVE CEREWET");
        System.out.println("     ANEKA MINUMAN !");
        System.out.println("-------------------------");
        System.out.println("      SPECIAL MENU :");
        System.out.println("1.\t Soft Drink");
        System.out.println("2.\t Mix Juice");
        System.out.println("3.\t Nescafe");
        System.out.println("4.\t Milk Soda");
        System.out.println("5.\t Tea");
        
        System.out.println(" ");
        
        System.out.print("Masukkan Nama Pembeli :");
        String nama = in.next();
        System.out.print("Masukkan pilihan anda :");
        int minuman = in.nextInt();
        
        switch (minuman) {
            case 1:
                System.out.println("Pesanan Anda adalah Soft Drink");
                break;
            case 2:
                System.out.println("Pesanan Anda adalah Mix Juice");
                break;
            case 3:
                System.out.println("Pesanan Anda adalah Nescafe");
                break;
            case 4:
                System.out.println("Pesanan Anda adalah Milk Soda");
                break;
            case 5:
                System.out.println("Pesanan Anda adalah Tea");
                break;
        }
        System.out.println("pesanan anda sedang kami antar ");
        System.out.println("terima kasih " +nama +" telah mapir kemari");

    }
}
