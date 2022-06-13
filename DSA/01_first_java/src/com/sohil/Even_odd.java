package com.sohil;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Given number " + num + " is odd.");
        }else {
            System.out.println("Given number " + num + " is even.");
        }


    }
}