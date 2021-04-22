/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class B extends A{
    public void tampilkan(){
// kita dapat memanggil method milik superclasnya dengan super.namamethod();
// super.tampilkan(); 
        System.out.println("Method milik kelas B dipanggil ...");
    }
}
