/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu.pkg3;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class W03_Latihan_2 {

    public static void main(String[] args) {
        int NilaiMhs[] = {80, 90, 88, 90, 100};
        String [] NamaMhs = {"andi", "samsul", "saiful", "rijal", "hadi"};
//      menampilkan semua array dengan for (perulangan)
        for (int i = 0; i < NilaiMhs.length; i++) {
//      akan mengulang hingga kurang dari banyak nilai didallam array
            System.out.println(NilaiMhs[i]);
        }
        for (String NamaMh : NamaMhs) {
            System.out.print(NamaMh);
            System.out.print(" ");
        }
    }
}
