package com.sohil;

import java.util.Arrays;
import java.util.Scanner;

public class Search_In_2D {
    public static void main(String[] args) {
        int[][] arr= new int[][]{
            {1, 2, 3},
            {34, 5, 65, 6, 7},
            {21, 43, 54, 65}
        };
        int target = 5435934;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    public static int[] search(int[][] arr, int target){
        if (arr.length == 0){
            return new int[]{-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

}

