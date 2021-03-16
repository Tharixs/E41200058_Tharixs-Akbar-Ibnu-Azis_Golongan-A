/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg3_w02;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
class Mobil {

    int harga;
    int pajakTahun;

    public void set(int harga, int pajakTahun) {
        this.harga = harga;
        this.pajakTahun = pajakTahun;
    }

    public void show() {
        System.out.println("info mobil");
        System.out.println("Harga mobil :" + harga);
        System.out.println("Pajak Pertahun :" + pajakTahun);

    }
}

public class Latihan3_W02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Mobil Mobilio = new Mobil();
        Mobilio.set(100, 3);
        Mobilio.show();

    }
}
