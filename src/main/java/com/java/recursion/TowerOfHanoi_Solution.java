package com.java.recursion;

public class TowerOfHanoi_Solution {

    public static void main(String[] args) {
        solveTowerOfHanoi(3, 1,2,3);

    }

    public static void solveTowerOfHanoi(int n , int start, int imdt, int dest){
        if(n == 1){
            System.out.println("Moving disc from " + start + " to " + dest);
            return;
        }

        solveTowerOfHanoi(n-1, start, dest, imdt);
        System.out.println("Moving disc from " + start + " to " + dest);
        solveTowerOfHanoi(n-1, imdt, start, dest);
    }
}