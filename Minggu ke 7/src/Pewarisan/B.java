/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class B extends A{
    int z;
    void TampilkanXYZ() {
        super.TampilkanXY();
        System.out.println("Nilai z = "+z);
    }
    
    void tampilkanJumlah(){
        System.out.println("Jumlah x + y + z = "+ (x+y+z));
    }
}
