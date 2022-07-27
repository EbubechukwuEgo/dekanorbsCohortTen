package chapter6;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Value for the opposite: ");
        double opposite = input.nextDouble();
        System.out.print("Value for the adjacent: ");
        double adjacent = input.nextDouble();

        hypotenuse(opposite, adjacent);
    }

    private static double hypotenuse(double opposite, double adjacent) {
        double hypotenuse = Math.sqrt(Math.pow(opposite, 2) + Math.pow(adjacent, 2));

        System.out.printf("The hypotenuse of the triangle is %.1f", hypotenuse);
        return hypotenuse;
    }
}
