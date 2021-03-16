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
  class Mahasiswa{
    String Fname, Lname, StuStatus,Nim;
    public  Mahasiswa(String Fname, String Lname,String StuStatus, String Nim){
       this.Fname= Fname;
       this.Lname=Lname;
       this.Nim=Nim;
       this.StuStatus=StuStatus;
    }
 }
public class Tugas_1 {
    
    public static void main(String[] args) {
        Mahasiswa Person = new Mahasiswa("Tharixs", "Akbar","Active","E41200058");
        
        System.out.println("Nama \t :"+Person.Fname+" "+Person.Lname);
        System.out.println("Nim \t :" +Person.Nim);
        System.out.println("Status \t :"+Person.StuStatus);
       
    }
    
}
