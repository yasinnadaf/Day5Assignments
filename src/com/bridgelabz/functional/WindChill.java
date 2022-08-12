package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature t and wind speed v");
        int t = s.nextInt();
        int v = s.nextInt();

        double w = 35.74+0.6215*t+(0.4275*t-35.75)*(Math.pow(v,0.16));
        System.out.println(w);
    }
}

