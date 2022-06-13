package com.sohil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an array of length 6:");
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(arr)));

    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}