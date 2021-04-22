/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
class A {

    void callthis() {
        System.out.println("inside Class A's Method!");
    }
}

class B extends A{

    void callthis() {
        System.out.println("Inside Class B's Methode!");
    }
}

class C extends A {

    void callthis() {
        System.out.println("Inside Class C's Methode!");
    }
}

class DynamicDispatch {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;

        ref = b;
        ref.callthis();

        ref = c;
        ref.callthis();
        
        ref = a;
        ref.callthis();
    }
}
