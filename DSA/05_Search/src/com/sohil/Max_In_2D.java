package com.sohil;

import java.util.Arrays;

public class Max_In_2D {
    public static void main(String[] args) {
        int[][] arr= new int[][]{
                {1, 2, 3},
                {34, 5, 65, 6, 7},
                {21, 43, 54, 65}
        };
        System.out.println(max(arr));
    }

    public static int max(int[][] arr){
        int ans = Integer.MIN_VALUE;
        if (arr.length == 0){
            return ans;
        }

        for (int[] row: arr) {
            for (int val: row) {
                if (val > ans) {
                    ans = val;
                }
            }
        }
        return ans;
    }

}
