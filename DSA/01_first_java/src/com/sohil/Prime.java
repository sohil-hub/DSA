package com.sohil;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number");
        int n = input.nextInt();
        boolean is_prime = true;
        for (int i=2; i*i<=n; i++){
            if (n % i == 0){
                is_prime = false;
            }
        }
        if (is_prime){
            System.out.println("Given number is prime");
        }else {
            System.out.println("Given number is not prime");
        }
    }
}
