package com.sohil;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerNumbersThanCurrent1365 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of an array: ");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] smallerNumbersThanCurrent(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[i] > arr[j]){
                    result[i] += 1;
                }
            }
        }
        return result;
    }
}
