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
public class W03_Tugas_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("       Karisma Agung Plaza");
        System.out.println("     Promo Belanja Berhadiah ");
        System.out.println(" Khusus pembelian 5 barang pertama ");
        System.out.println("  dengan harga minimum Rp 10.000");
        System.out.println("------------------------------------------");
        System.out.print("Nama Pembeli : ");
        String namaP = in.next();

        int Jumlah = 0;
        String Case = " ";
        int Harga[] = new int[5];
        for (int i = 0; i < Harga.length; i++) {
            int nilai = i + 1;
            System.out.print("Maaukkan harga barang ke " + nilai + " : ");

            Harga[i] = in.nextInt();

        }
        System.out.println(" ");
        System.out.print("Total karga pembelian atas nama " + namaP + " ");
        for (int i = 0; i < Harga.length; i++) {
            if (Harga[i] >= 10000) {
                Case = "bonus";
            } else if (Harga[i] <= 10000) {
                Case = "kosong";
                break;
            } else {
                System.out.println("erorr");
            }

        }
        for (int j = 0; j < Harga.length; j++) {
            Jumlah += Harga[j];
        }
        System.out.println(Jumlah);
        switch (Case) {
            case "bonus":
                System.out.println("selamat bonus anda mendapatkan Bonus 1 piring cantik");
                break;
            case "kosong":
                System.out.println("Tidak ada Bonus");
                break;
        }
        System.out.println("------------------------------------------");
        System.out.println("                 Trimakasih ");
        System.out.println("     anda sudah berbelanja di toko kami ");

    }
}
