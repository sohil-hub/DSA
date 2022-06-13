package com.sohil;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        
        int a = input.nextInt();
        int b = input.nextInt();

        get_all_Armstrong(a, b);
    }
    
    static void get_all_Armstrong(int a, int b){
        for (int i = a; i <= b; i++){
            int check = i, sum = 0, rem;
            while (check != 0){
                rem = check % 10;
                sum += rem*rem*rem;
                check = check / 10;
            }
            if (sum == i){
                System.out.println(i+" is an armstrong number");
            }
        }
    }
}