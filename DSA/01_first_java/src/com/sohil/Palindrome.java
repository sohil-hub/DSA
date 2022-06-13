package com.sohil;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        boolean result = is_palindrome(s);
        if (result){
            System.out.println("Given string is palindrome");
        }else {
            System.out.println("Given string is not palindrome");
        }
    }
    static boolean is_palindrome(String s){
        int i = 0, j = s.length() - 1;

        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}