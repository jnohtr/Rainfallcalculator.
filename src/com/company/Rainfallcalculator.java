package com.company;

import java.util.Scanner;

public class Rainfallcalculator {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello World!");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("width in '?: ");
        double width = keyboard.nextDouble();
        System.out.println("heighth in '?: ");
        double heighth = keyboard.nextDouble();
        /*System.out.println("rainfall?: ");
        double rainfall = keyboard.nextDouble();*/

        width = 12 * width;
        heighth = 12 * heighth;

        System.out.println("width: " + width + " inches heighth:"  + heighth + "inches");

        double dim = width * heighth;

        System.out.println("dim: " + dim);

        System.out.print("rainfall?: ");
        double rainfall = keyboard.nextDouble();

        double runoff = dim / 231;
        System.out.println("water runoff : " + (runoff*100)/100);
    }
}
