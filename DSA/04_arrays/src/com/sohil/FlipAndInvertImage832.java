package com.sohil;

import java.util.Arrays;
import java.util.Scanner;

public class FlipAndInvertImage832 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter num of cols: ");
        int cols = in.nextInt();
        int[][] image = new int[rows][cols];
        for (int i=0; i < rows; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < cols; j++) {
                image[i][j] = in.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        for (int[] row:image){
            System.out.println(Arrays.toString(row));
        }
        int[][] inverted = flipAndInvertImage(image);
        for (int[] row:inverted){
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        return get_flipped(image);
    }
    public static int[][] get_flipped(int[][] image) {
        int rows = image.length;
        for (int i = 0; i < rows; i++){
            int start = 0;
            int end = image[i].length-1;

            while(start <= end) {
                int temp = get_inverted(image[i][start]);
                image[i][start] = get_inverted(image[i][end]);
                image[i][end] = temp;

                start++;
                end--;
            }
        }
        return image;
    }

    public static int get_inverted(int n){
        if (n == 0)
            return 1;
        else
            return 0;
    }

}
