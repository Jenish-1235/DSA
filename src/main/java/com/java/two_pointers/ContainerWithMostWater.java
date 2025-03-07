package com.java.two_pointers;

import java.util.Scanner;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arr length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findMostWater(arr));
    }

    public static int findMostWater(int[] arr){
        int water = 0;

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            int iHeight = arr[i];
            int jHeight = arr[j];

            if(iHeight < jHeight){
                int temp = iHeight * (j-i);
                if (temp > water) {
                    water = temp;
                }
                i++;
            }else{
                int temp = jHeight * (j-i);
                if (temp > water) {
                    water = temp;
                }
                j--;
            }
        }

        return water;
    }
}