package com.java.recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits: " + sumOfDigits(n));
    }

    public static int sumOfDigits(int n) {
        if (n % 10 == 0){
            return 0;
        }
        if (n<0) {
            return sumOfDigits(-1 * n);
        }
        return n%10 + sumOfDigits(n/10);

    }
}
