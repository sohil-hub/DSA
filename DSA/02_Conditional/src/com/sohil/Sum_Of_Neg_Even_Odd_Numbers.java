package com.sohil;

import java.util.Scanner;

public class Sum_Of_Neg_Even_Odd_Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers of your liking and 0 to stop");
        int num, evenSum = 0, oddSum = 0, negSum = 0;

        while (true){
            num = input.nextInt();
            if (num < 0){
                negSum += num;
            }else {
                if (num % 2 == 0) {
                    evenSum += num;
                }else {
                    oddSum += num;
                }
            }
            if (num == 0) {
                System.out.println("Negative Sum " + negSum + " Even sum " + evenSum + " Odd Sum " + oddSum);
                break;
            }
        }



    }
}