package com.java.recursion;

public class TowerOfHanoi_Stepwise {

    /*
    
    In the classic problem of the Towers of Hanoi, you have 3 towers numbered from 1 to 3 (left to right) and A disks numbered from 1 to A (top to bottom) of different sizes which can slide onto any tower.
    The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).
    You have the following constraints:

    Only one disk can be moved at a time.
    A disk is slid off the top of one tower onto another tower.
    A disk cannot be placed on top of a smaller disk.

    You have to find the solution to the Tower of Hanoi problem.
    You have to return a 2D array of dimensions M x 3, where M is the minimum number of moves needed to solve the problem.
    In each row, there should be 3 integers (disk, start, end), where:

    disk - number of the disk being moved
    start - number of the tower from which the disk is being moved
    end - number of the tower to which the disk is being moved

     */

    private static int idx = 0;
    public static void main(String[] args) {
        int[][] ans = solveTowerHanoi(3);

        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] solveTowerHanoi(int A){
        int numberOfSteps = (int) Math.pow(2, A) - 1;

        int[][] ans = new int[numberOfSteps][3];


        fillAns(A, 1, 2, 3, ans);

        return ans;
    }

    public static void fillAns(int A, int start, int imdt, int dest, int[][] ans){
        if (A == 1) {
            ans[idx][0] = 1;
            ans[idx][1] = start;
            ans[idx][2] = dest;
            idx++;
            return;
        }

        fillAns(A-1, start, dest, imdt, ans);
        ans[idx][0] = A;
        ans[idx][1] = start;
        ans[idx][2] = dest;
        idx++;

        fillAns(A-1, imdt, start, dest, ans);
    }
    
}
