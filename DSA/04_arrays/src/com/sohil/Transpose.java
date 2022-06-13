package com.sohil;


import java.util.Arrays;
import java.util.Scanner;

//17. [Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)

public class Transpose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter num of cols: ");
        int cols = in.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i=0; i < rows; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        for (int[] row:matrix){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Transposed matrix: ");
        int[][] t_matrix = transpose(matrix);
        for (int[] row:t_matrix){
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int temp;
        for (int i=0; i<matrix.length; i++) {
            for (int j=i+1; j<matrix[i].length; j++){
                temp         = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}