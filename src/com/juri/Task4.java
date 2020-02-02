package com.juri;

import java.util.Scanner;

public class Task4 {

    // написать функцию решения квадратного уравнения
    // ax^2 + bx + c = 0

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter values for a, b and c.
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Compute the discriminant of the quadriatic equation.
        double discriminant = b * b - 4 * a * c;

        // Compute the real roots of the quadriatic equation if any.
        System.out.print("The equation has ");
        if (discriminant > 0) {
            double x1;
            double x2;
            x1 = (-b + Math.pow(discriminant)) / (2 * a);
            x2 = (-b - Math.pow(discriminant)) / (2 * a);
            System.out.println("two roots " + x1 + " and " + x2);
        } else if (discriminant == 0) {

            double x;
            x = -b / (2 * a);
            System.out.println("one root " + x);
        } else
            System.out.println("no real roots");
    }
}


//4et ja  nakosja4il



