package com.sohil;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");

        int n = input.nextInt();
        get_fib_upto_n(n);
    }
    static void get_fib_upto_n(int n){
        int n1=0, n2=1, n3;
        System.out.println(n1);
        System.out.println(n2);

        for (int i = 2; i < n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }
    }
}