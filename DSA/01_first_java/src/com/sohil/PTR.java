package com.sohil;

import java.util.Scanner;

public class PTR {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal Amount, Time and Rate: ");
        float P = input.nextFloat();
        float T = input.nextFloat();
        float R = input.nextFloat();
        System.out.println(((Object)P).getClass().getSimpleName());
        System.out.println(get_simple_interest(P, T, R));
    }
    static float get_simple_interest(float p, float t, float r){
        return p*t*r/100;
    }
}