package com.sohil;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = input.nextInt();
        int fact = 1;
        for (int i = 2; i <= n; i++){
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }
}