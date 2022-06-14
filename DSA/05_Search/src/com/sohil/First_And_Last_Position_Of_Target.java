package com.sohil;

import java.util.Arrays;

public class First_And_Last_Position_Of_Target {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30, 50, 60, 60, 80, 110, 130, 140, 170};
//        arr = new int[]{100, 90, 80, 45, 32, 10};
        int target = 60;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    public static int search(int[] nums, int target, boolean isFirstIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){
                end = mid - 1;
            }else if (target > nums[mid]){
                start = mid + 1;
            }else {
                ans = mid;
                if (isFirstIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


}
