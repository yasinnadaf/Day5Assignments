package com.bridgelabz.basics;


import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scr.nextInt();

        if( n % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

    }
}

