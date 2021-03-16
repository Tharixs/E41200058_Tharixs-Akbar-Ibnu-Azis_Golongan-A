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
public class ManagingPeople {
    public static void main(String[] args) {
        
        Person p1 = new Person("Rojali", 35);
        Person p2 = new Person ("Saipul", 25);
        
        if (p1.getAge()==p2.getAge()){
            System.out.println(p1.getAge()+" "+"is the same age as "+ p2.getName());
        }else{
            System.out.println(p1.getName()+" "+"is Not the same age as "+p2.getName());
        }
    }
}
