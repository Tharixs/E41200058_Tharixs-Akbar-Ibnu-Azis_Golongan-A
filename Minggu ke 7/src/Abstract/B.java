/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class B extends A{
    public void method2(){
//      super.method2(); tidak dapat dijalankan karena method2 di super class belum konkrit
        System.out.println("Method abstract yang sudah menjadi konkrit dalam kelas B");
    }
}
