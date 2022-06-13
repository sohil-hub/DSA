package com.sohil;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray1470 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));

        int[] shuffledArray = shuffle(arr, length/2);
        System.out.println("Shuffled array: " + Arrays.toString(shuffledArray));


    }

    public static int[] shuffle(int[] arr, int n) {
        int[] ans = new int[2*n];
//        int j = n;
        for (int i=0, j=0; i < n; i++, j+=2) {
            ans[j] = arr[i];
            ans[j+1] = arr[i+n];
        }
        return ans;
    }
}
