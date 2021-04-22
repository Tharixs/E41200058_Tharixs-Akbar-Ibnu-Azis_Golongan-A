/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan2;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class Orang {
    
    private String nama;
    private int tinggi;
    private double berat;
    
    public Orang(String nama, int tinggi, double berat  ){
        this.nama= nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    public String print(){
        return ("Nama = " + nama + "\nTinggi = "+tinggi+"\nBerat badan = "+berat);
    }
    
}
