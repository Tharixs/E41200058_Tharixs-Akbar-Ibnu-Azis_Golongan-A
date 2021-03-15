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
public class Person {
    String name;
    int Age;
    
    public Person(String name, int Age){
        this.name= name;
        this.Age = Age;
    }
    public  String getName(){
        return name;
    }
    public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
}
