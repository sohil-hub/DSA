package com.sohil;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int temp;
        if (a < b){
            temp = a;
            a = b;
            b = temp;
        }

        int hcf = get_HCF(a, b);
        int lcm = a * b / hcf;
        System.out.println("HCF is: " + hcf);
        System.out.println("LCM is: " + lcm);

    }

    static int get_HCF(int a, int b){
        int rem = a % b;
        if (rem == 0){
            return b;
        }
        return get_HCF(b, rem);

    }
}