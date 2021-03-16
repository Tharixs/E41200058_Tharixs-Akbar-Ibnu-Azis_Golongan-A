/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_w02;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class Tugas_4 {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = new String ("DEF");
        String s3 = "AB"+"C";
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3==s1);
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.equals(s1));
    }
           
}
