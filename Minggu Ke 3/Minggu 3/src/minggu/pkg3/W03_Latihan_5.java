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
public class W03_Latihan_5 {

    public static void main(String[] args) {
//       cek tangki BBM anda
        Scanner in = new Scanner(System.in);
        System.out.print("cek Indikator BBM anda :");
        String indikator;
        indikator = in.next();
        switch (indikator) {
            case "hijau":
                System.out.println("Gas jalan jalan broo ");
            break;
            case "kuning":
                System.out.println("segera cari pom ya ");
            break;
            case "merah":
                System.out.println("siap siap nyotok bro ");
            break;
        }
    }
}
