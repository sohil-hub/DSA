package com.sohil;

import java.util.Scanner;

public class NumberofGoodPairs1512 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of an array: ");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Number of good pairs = " + numIdenticalPairs(arr));
    }

    public static int numIdenticalPairs(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(String.valueOf(i) + String.valueOf(j));
                    count++;
                }
            }
        }
        return count;
    }
}
