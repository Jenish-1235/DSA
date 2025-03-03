package com.java.recursion;

import java.util.Scanner;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(checkStringPalindrome(str));
    }

    public static boolean checkStringPalindrome(String str) {
        if (str == null || str.isEmpty() || str.length() == 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return checkStringPalindrome(str.substring(1, str.length() - 1));
        }else{
            return false;
        }
    }
}
