package chapter6;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three floating point values separated by spaces: ");

        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        double number3 = scan.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("Maximum number is: " + result);
    }

    private static double maximum(double x, double y, double z) {
        double maximumValue = x;

        if (y > maximumValue) {
            maximumValue = y;
        }

        if (z > maximumValue) {
            maximumValue = z;
        }

        return maximumValue;
    }
}
