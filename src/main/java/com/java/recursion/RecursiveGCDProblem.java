package com.java.recursion;

public class RecursiveGCDProblem {
    public static void main(String[] args) {
        System.out.println(gcdBySubstraction(12, 30));
        System.out.println(gcdByModulo(0, 1));
    }

    public static int gcdBySubstraction(int A, int B){
        if (B == 0) {
            return A;
        }

        if (B > A) {
            return gcdBySubstraction(B, A);
        }

        return gcdBySubstraction(B, A - B);
    }

    public static int gcdByModulo(int A, int B){
        if (B == 0) {
            return A;
        }

        if (B > A) {
            return gcdByModulo(B, A);
        }

        return gcdByModulo(B, A % B);
    }

    
}
