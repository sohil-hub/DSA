package com.sohil;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        boolean is_leapyear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        if (is_leapyear){
            System.out.println(year + " is a leap year.");
        }else {
            System.out.println(year + " is a not leap year.");
        }

    }
}