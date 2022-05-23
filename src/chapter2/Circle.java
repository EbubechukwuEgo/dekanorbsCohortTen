package chapter2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insert the radius here: ");
        int radius = input.nextInt();

        double diameter = 2 * radius;

        double circumference = 2 * Math.PI * radius;

        double area = Math.PI * radius * radius;

        System.out.printf("The diameter of a circle is: %f%n", diameter);
        System.out.printf("The circumference of a circle is: %f%n", circumference);
        System.out.printf("The diameter of a circle is: %f", area);
    }
}
