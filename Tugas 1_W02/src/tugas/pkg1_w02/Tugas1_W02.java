/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg1_w02;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */


     class Person {

        String FName, LName, StuStatus;
        int stuId;

        public void set(String FName, String LName, String StuStatus, int stuId) {
            this.FName = FName;
            this.LName = LName;
            this.StuStatus = StuStatus;
            this.stuId = stuId;

        }
        public void show(){
            System.out.println("Informasi Mahasiswa/i");
            System.out.println("Student Name :"+FName+" "+LName);
            System.out.println("Studet Id :"+stuId);
            System.out.println("Student Status :"+StuStatus);
        }
    }

public class Tugas1_W02 {
    public static void main(String[] args) {
        Person Saiful = new Person(); 
        Saiful.set("Saipul", "Rojali", "Active", 4125676);
        Saiful.show();
        
        
    }

}
