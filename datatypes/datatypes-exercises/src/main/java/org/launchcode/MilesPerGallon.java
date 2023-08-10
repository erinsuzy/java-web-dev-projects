package org.launchcode.studios;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive?");
        Double numMiles = input.nextDouble();

        System.out.println("How many gallons of gas did you use?");
        Double numGal = input.nextDouble();

        Double mpg = numMiles / numGal;
        System.out.println("Your mpg is " + mpg + "mpg.");

    }
}
