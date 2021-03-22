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
public class W03_Latihan_3 {
    public static void main(String[] args) {
        int angka [][]= {{18,04,02,90},{1,4,2,5},{11,34,55,66}};
        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 4; kolom++) {
                System.out.print(angka[baris][kolom]+"\t");
            }
            System.out.println(" ");
        }
    }
}
