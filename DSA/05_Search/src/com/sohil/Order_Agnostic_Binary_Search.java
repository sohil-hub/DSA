package com.sohil;

public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
//        arr = new int[]{100, 90, 80, 45, 32, 10};
        int target = 80;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
            int start = 0;
            int end = arr.length - 1;

            boolean isAscending = arr[start] < arr[end];

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
            return -1;
        }

}
