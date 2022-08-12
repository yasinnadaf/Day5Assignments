package com.bridgelabz.functional;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of x");
        int x = sc.nextInt();
        System.out.println("Enter a value of y");
        int y = sc.nextInt();
        double distance = Math.sqrt(x*x+y*y);
        System.out.println(distance);
    }
}

