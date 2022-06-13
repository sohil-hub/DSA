package com.sohil;

import java.util.Scanner;

public class NCR_NPR {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of n and r: ");
        int n = input.nextInt();
        int r = input.nextInt();

        int nPr = get_factorial(n) / get_factorial(n - r);
        int nCr = nPr / get_factorial(r);

        System.out.println("nPr: " + nPr);
        System.out.println("nCr: " + nCr);

    }

    static int get_factorial(int n){
        int fact = 1;
        for (int i = 2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
}