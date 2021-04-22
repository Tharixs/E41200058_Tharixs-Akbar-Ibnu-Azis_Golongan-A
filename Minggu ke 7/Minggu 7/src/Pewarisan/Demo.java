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
public class Demo {
    
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        
        System.out.println("Super Class ");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampilkanXY();
        
        System.out.println("Sub Class");
        // mewarisi x dan y yang ada pada superclass
        subOb.x = 12;
        subOb.y = 45;
          
        //nilai yang hanya ada di sub class
        subOb.z = 64;
        subOb.TampilkanXYZ();
        subOb.tampilkanJumlah();
    }
        
}
