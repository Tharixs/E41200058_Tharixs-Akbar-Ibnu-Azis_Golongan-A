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
public class BubleSort {

    static void bubleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int tukar = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {

                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    tukar++;
                }
            }
        }
        tampilkan(arr);
        System.out.println();
        System.out.println("Melakukan " + tukar + "x penukaran");
    }

    static void tampilkan(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    static void tampilkan2(int[] arr) {
        int n = arr.length - 1;
        for (int j = n; j > 0; j--) {
            System.out.print(arr[j] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Array Before Bubble Sort");
        tampilkan(arr);
        System.out.println();
        System.out.println("Array after buble sort");
        bubleSort(arr);
        System.out.println("Array Descending ");
        tampilkan2(arr);
    }
}
