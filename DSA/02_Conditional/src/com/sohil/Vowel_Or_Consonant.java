package com.sohil;

import java.util.Scanner;

public class Vowel_Or_Consonant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Character: ");
        char ch = input.nextLine().trim().toLowerCase().charAt(0);

        switch (ch){
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }

    }
}