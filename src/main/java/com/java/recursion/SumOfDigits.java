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

<<<<<<< HEAD
        if (n<0) {
            return sumOfDigits(-1 * n);
        }
=======
>>>>>>> a439d8bdf638ebd1316cbbfaf38b1bef8f12e323
        return n%10 + sumOfDigits(n/10);

    }
}
