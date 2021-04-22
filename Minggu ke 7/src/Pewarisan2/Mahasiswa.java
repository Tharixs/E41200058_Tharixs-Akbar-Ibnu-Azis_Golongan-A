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
public class Mahasiswa extends Orang {
    
    private String nim;
    private String Instansi;
    private double nilai;
    
    public Mahasiswa(String nama,String nim, int tinggi, double berat, String instansi, double nilai) {
       super(nama, tinggi, berat);
       this.nim = nim;
       this.nilai= nilai;
       this.Instansi = instansi;
    }
    public String print(){
    return (super.print()+"\nNim = "+nim+"\nInstansi = "+Instansi+"\nNilai = "+nilai); 
    }
    
   
}
