package com.sohil;

import java.util.Scanner;

public class EvenDaysOfAugust {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 31 ; i++){
            if (i % 2 == 0){
                count += 1;
            }
        }
        System.out.println(count);
    }
}