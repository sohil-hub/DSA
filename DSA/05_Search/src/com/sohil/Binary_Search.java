package com.sohil;

import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
        int target = 110;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
