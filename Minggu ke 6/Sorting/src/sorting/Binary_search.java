/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class Binary_search {
    
    int binarySearch(int arr[], int find)
    {
        int temp = 0;
        int n = arr.length - 1;
        while (temp <= n) {
            int mid = temp + (n - temp) / 2;
//  cek jika nilai yang dicari ada di tengah 
            if (arr[mid] == find)
                return mid;
  
// cek jika nilai lebih besar dari nilai yang ada di tengah  
            if (arr[mid] < find)
                temp = mid + 1;
  
// cek jika lebih kecil dari nilai di tengah
            else
                n = mid - 1;
        }
// jika tidak ada akan mengembalikan nilai -1
        return -1;
        
    }
  
   
    public static void main(String args[])
    {
        Binary_search ob = new Binary_search();
        int arr[] = { 3, 60, 35, 2, 45, 320, 5};
        Arrays.sort(arr);
        int l = arr.length;
        int find = 60;
        int result = ob.binarySearch(arr, find);
        if (result == -1)
            System.out.println("Data tidak ada ");
        else
            System.out.println("Data ditemukan di Index ke " + result);
    }
}

