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
public class SelectionSort {

    static void selectionSort(int arr[]) {
        int n = arr.length;
        int tukar = 0;

        for (int i = 0; i < n; i++) {
            // mencari nilai minimum
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            tukar++;
        }

        tampilkan(arr);
        System.out.println("mengalami " + tukar + "x swap ");
        System.out.println("Array terurut");

    }

    // menampilkan 
    static void tampilkan(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver code to test above    
// 
    public static void main(String args[]) {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};
        selectionSort(arr);

//        tampilkan(arr);
    }
}
