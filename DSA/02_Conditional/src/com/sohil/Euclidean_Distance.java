package com.sohil;

import java.util.Scanner;

public class Euclidean_Distance {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coordinates of first point: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter the coordinates of second point: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("Distance is: " + Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));
    }
}