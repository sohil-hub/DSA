package com.sohil;

import java.util.Scanner;

public class MatrixDiagonalSum1572 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i=0; i < n; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println(diagonalSum(matrix));
    }

    public static int diagonalSum(int[][] matrix) {
        int i = 0, j = matrix.length-1, sum=0;
        while (i < matrix.length){
            if (i != j){
                sum += matrix[i][i];
                sum += matrix[j][j];
            }else{
                sum += matrix[i][i];
            }
            i++;
            j--;
        }
        return sum;
    }
}
