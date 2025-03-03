package com.java.recursion;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(power(n, m));
    }

    public static int power(int n , int m){
        if (m == 1) {
            return n;
        }

        return n * power(n, m-1);
    }

}
