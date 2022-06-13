package com.sohil;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter String: ");
        String s = input.nextLine();

        String r = "";

        for (int i=s.length()-1; i >= 0; i--){
            r += s.charAt(i);
        }


        System.out.println("reversed string is:   " + r);
    }
}