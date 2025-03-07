package com.java.two_pointers;

import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of 1st arr: ");
        int n = sc.nextInt();
        System.out.println("Enter length of 2nd arr: ");
        int m = sc.nextInt(); 

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.out.println("Enter elements in sorted order for array 1");
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter elements in sorted order for array 2");
        for(int j = 0; j < m; j++){
            arr2[j] = sc.nextInt();
        }
        sc.close();

        mergeArrays(arr1, arr2);
    }   

    public static int[] mergeArrays(int[] arr1, int[] arr2){

        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[arr1.length + arr2.length];
        
        int i = 0, j = 0, k = 0;

        while(i < n && j < m){
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
            }else{
                ans[k++] = arr2[j++];
            }
        }

        while (i < n) {
            ans[k++] = arr1[i++];
        }

        while (i < m) {
            ans[k++] = arr2[j++];
        }
        return ans;
    }
}
