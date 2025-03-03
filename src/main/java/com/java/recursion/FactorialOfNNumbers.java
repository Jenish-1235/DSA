package com.java.recursion;

import java.util.Scanner;

public class FactorialOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is " + factorialOfNNumbers(n));
    }

    public static int factorialOfNNumbers(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorialOfNNumbers(n-1);
    }
}
