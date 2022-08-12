package com.bridgelabz.functional;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        System.out.println("Enter value of c");
        int c = sc.nextInt();
        double delta = b*b - 4*a*c;

        if ( delta < 0){
            System.out.println("Roots does not exist and are imaginary");
        }
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1 is : " + x1);
            System.out.println("Root 2 is : " + x2);
        }

    }
}

