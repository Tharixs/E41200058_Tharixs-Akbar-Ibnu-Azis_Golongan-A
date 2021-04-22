/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konstructor;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class Demo {
    public static void main(String[] args) {
        // C turunan dari b sehingga akan menampilkan prilaku yang ada di b dan a
        C subOb = new C();
        System.out.println("Menampilkan B");
        // B turunan dari a sehingga akan menampilkan prilaku yang ada di a
        B sub = new B();
        System.out.println("Menampilkan Konstructor A ");
        A Sup = new A();
    }
}
