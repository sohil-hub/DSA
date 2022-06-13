package com.sohil;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter total price and discount rate: ");
        float price = input.nextFloat();
        float rate = input.nextFloat();

        float Discount = price*rate/100;

        System.out.println("Discount is: " + Discount);

    }
}