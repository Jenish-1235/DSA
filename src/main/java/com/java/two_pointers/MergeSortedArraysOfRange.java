package com.java.two_pointers;

import java.util.Scanner;

public class MergeSortedArraysOfRange {

    private static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr length: ");
        int n = sc.nextInt();

        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter l , m , r : ");
        int l = sc.nextInt(), m = sc.nextInt() , r = sc.nextInt();
        sc.close(); 
        
        mergeSortedRanges(arr, l, m, r);

        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSortedRanges(int[] arr , int l, int m, int r){
        int[] temp = new int[arr.length];

        int i = 0;

        while (i < l) {
            temp[i] = arr[i];
            i++;
        }

        int constM = m;
        while (l < constM && m <=r) {
            if (arr[l] < arr[m]) {
                temp[i] = arr[l];
                i++;
                l++;                
            }else{
                temp[i] = arr[m];
                m++;
                i++;
            }     
        }

        while (l<constM) {
            temp[i] = arr[l];
            l++;
            i++;
        }

        while (m<r) {
            temp[i] = arr[m];
            m++;
            i++;
        }

        while (i < arr.length) {
            temp[i] = arr[i];
            i++;
        }


        for(int f = 0; f < arr.length; f++){
            arr[f] = temp[f];
        }
    }
}
