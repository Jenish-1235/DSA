package com.java.recursion;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The sum of " + n + " numbers is " + sumOfNNumbers(n));
    }

    public static int sumOfNNumbers(int n) {
        if(n == 0){
            return 0;
        }
        return sumOfNNumbers(n-1) + n;
    }
}
