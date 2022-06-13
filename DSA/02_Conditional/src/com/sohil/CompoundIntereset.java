package com.sohil;

import java.util.Scanner;

public class CompoundIntereset {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double p = input.nextDouble();

        System.out.println("Enter the interest rate: ");
        double r = input.nextDouble()/100;

        System.out.println("Enter the total time: ");
        double t = input.nextDouble();

        System.out.println("compound time: ");
        double n = input.nextDouble();

        System.out.println("total amount:  " + p*Math.pow(1 + r/n, t*n));
    }
}