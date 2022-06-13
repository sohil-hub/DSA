package com.sohil;

public class Ceiling_Number {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
//        arr = new int[]{100, 90, 80, 45, 32, 10};
        int target = 40;
        int ceil = ceilingElement(arr, target);
        int floor= floorElement(arr, target);
        System.out.println(ceil + " " + arr[ceil]);
        System.out.println(floor + " " + arr[floor]);
    }

    static int ceilingElement(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]){
            return -1;
        }
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
        return start;
    }

    static int floorElement(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if (target < arr[start]){
            return -1;
        }
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
        return end;
    }
}
