package com.java.recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GrayCode {

    private static int idx = 0;

    public static void main(String[] args) {
        int[] ans = grayCodeSequence(2);

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] grayCodeSequence(int A){
        ArrayList<String> binaries = grayCodeHelper(A);

        int[] ans = new int[binaries.size()];

        for(int i = 0; i < binaries.size(); i++){
            ans[i] =  Integer.parseInt(binaries.get(i) , 2);
        }

        return ans;
    }

    public static ArrayList<String> grayCodeHelper(int A){
        if (A == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("0");
            return ans;
        }

        if (A == 1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("0");
            ans.add("1");
            return ans;
        }
        
        ArrayList<String> earlierGrayCode = grayCodeHelper(A-1);
        ArrayList<String> ans = new ArrayList<>();

        for(String code : earlierGrayCode){
            ans.add("0" + code);
        }

        for(int i = earlierGrayCode.size() - 1; i >=0 ; i--){
            ans.add("1" + earlierGrayCode.get(i));
        }

        return ans;
    }
    
}
