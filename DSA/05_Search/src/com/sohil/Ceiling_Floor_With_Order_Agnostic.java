package com.sohil;

public class Ceiling_Floor_With_Order_Agnostic {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
        arr = new int[]{100, 90, 80, 45, 32, 10};
        int target = 1000;
        int ceil = ceilingElement(arr, target);
        int floor= floorElement(arr, target);
        System.out.println("Ceil: " + ceil);
        System.out.println("Floor: " + floor);
    }

    static int ceilingElement(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        if (isAscending){
            if (target > arr[end]) return -1;
        }else {
            if (target > arr[start]) return -1;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }

            if (isAscending){
                if (target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        if (isAscending){
            return start;
        }else {
            return end;
        }
    }

    static int floorElement(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        if (isAscending){
            if (target < arr[start]) return -1;
        }else {
            if (target < arr[end]) return -1;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }

            if (isAscending){
                if (target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        if (isAscending){
            return end;
        }else {
            return start;
        }
    }
}
