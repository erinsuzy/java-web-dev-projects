package org.launchcode.studios;

import java.awt.*;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of rectangle:");
        Double numLength = input.nextDouble();

        System.out.println("Enter width of rectangle:");
        Double numWidth = input.nextDouble();

        Double area = numLength * numWidth;
        System.out.println("The area of your rectangle is " + area);

    }
}
