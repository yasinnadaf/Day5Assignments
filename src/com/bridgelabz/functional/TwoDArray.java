package com.bridgelabz.functional;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number of rows m");
        int m = scr.nextInt();
        System.out.println("Enter the number of colum n");
        int n = scr.nextInt();

        int [][] a =new int[m][n];
        System.out.println("Input");
        for(int i = 0; i < m; i++ ){
            for(int j = 0; j < n; j++){
                a[i][j] = scr.nextInt();
            }
        }
        System.out.println("Output");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.println("a["+i+"]["+j+"] = "+a[i][j]);
            }
        }
    }
}
