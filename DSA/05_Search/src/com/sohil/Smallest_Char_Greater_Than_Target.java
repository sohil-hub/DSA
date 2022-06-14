package com.sohil;

public class Smallest_Char_Greater_Than_Target {
    public static void main(String[] args) {

        char[] arr = new char[]{'c', 'f', 'j'};
        char target = 'f';
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        char letter = letters[start % letters.length];
        return letter;
    }
}
