package com.java.recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci upto " + n + " is " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
