package com.sohil;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAltitude1732 {
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

        int highest_altitude = largestAltitude(arr);
        System.out.println("Highest altitude = " + highest_altitude);
    }

    public static int largestAltitude(int[] arr) {
        int max = 0, sum=0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
            if (max<sum){
                max = sum;
            }
        }
        return max;
    }
}
