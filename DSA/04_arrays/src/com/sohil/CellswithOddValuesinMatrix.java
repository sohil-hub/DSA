package com.sohil;

import java.util.Scanner;

public class CellswithOddValuesinMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        int[][] indices = new int[2][2];
        for (int i=0; i < indices.length; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < indices[i].length; j++) {
                indices[i][j] = in.nextInt();
            }
        }
        System.out.println(oddCells(2, 2, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] ans =new int[m][n];
        int index;

        for (int i=0; i<indices.length; i++){
            index = indices[i][0];
            for (int j = 0; j < n; j++){
                ans[index][j] += 1;
            }
            index = indices[i][1];
            for (int j = 0; j < m; j++){
                ans[j][index] += 1;
            }
        }
        int count=0;
        for (int[] row: ans) {
            for (int element: row) {
                if (element % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
