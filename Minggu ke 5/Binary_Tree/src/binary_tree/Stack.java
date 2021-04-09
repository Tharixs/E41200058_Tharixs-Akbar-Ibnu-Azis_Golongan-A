/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_tree;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class Stack {
    private int SIZE = 20;
    private int[] s;
    private int top;
    
    public Stack(){
        s = new int[SIZE];
    }
    public void push (int j){
        s[++top] = j;
    }
    public  int pop (){
        return s[top--];
    }
    public int peek(){
        return s[top];
    }
    public boolean isEmpty(){
        return (top == 0 );
    }
}
