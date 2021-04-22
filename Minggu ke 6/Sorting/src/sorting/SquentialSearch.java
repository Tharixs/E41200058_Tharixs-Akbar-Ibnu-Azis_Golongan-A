/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
 
public class SquentialSearch {
    
    public static void sequentialSearch(int [] parameterOne, int parameterTwo){
        int index = -1;
        for (int i = 0; i < parameterOne.length; i++) {
            if (parameterOne[i] == parameterTwo) {
                index = i;
                System.out.println("Your target integer is in indext "+ index + " of array");
                break;
            }
        }
        if (index == -1){
            System.out.println("Your target integer does not exist in the array ");        
        }
            
    }
    
    public static void main(String[] args) {
        int [] Example = {2,9,6,7,4,3,0,1};
        int target = 4;
        sequentialSearch(Example, target);
    }
   
}
