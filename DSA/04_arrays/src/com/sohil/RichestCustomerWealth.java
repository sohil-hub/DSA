package com.sohil;

import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter num of cols: ");
        int cols = in.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        for (int[] row:matrix){
            System.out.println(Arrays.toString(row));
        }

        int wealth = MostWealth(matrix);
        System.out.println("Most wealth is: "+ wealth);

    }

    public static int MostWealth(int[][] matrix){
        int max = 0;
        for (int[] row: matrix) {
            int sum = 0;
            for (int elem: row) {
                sum += elem;
            }
            max = sum>=max ? sum : max;
        }
        return max;
    }
}
