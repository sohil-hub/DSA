package com.sohil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Occurrences_Of_Target {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30, 50, 60, 60, 60, 60, 80, 110, 130, 140, 170};
//        arr = new int[]{100, 90, 80, 45, 32, 10};
        int target = 60;
        List<Integer> result = targetIndices(arr, target);
        System.out.println(result);

    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int[] ans = {-1, -1};
        int temp;
        for (int i = 0; i <nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if(nums[i] >nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }else{
            return result;
        }

        for(int i=ans[0]; i<=ans[1]; i++){
            result.add(i);
        }
        return result;

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
