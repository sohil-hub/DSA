package com.sohil;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CheckIfPangram1832 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = in.nextLine();
        System.out.println("Original String: " + str);

        if (checkIfPangram(str)) {
            System.out.println("Sentence is pangram");
        }else{
            System.out.println("Sentence is not pangram");
        }

    }

    public static boolean checkIfPangram(String s) {
        s = s.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1){
                return false;
            }
        }
        return true;
    }
}
