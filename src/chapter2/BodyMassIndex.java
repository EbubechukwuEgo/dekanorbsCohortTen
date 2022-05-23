package chapter2;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the body in kilograms: ");
        double weightInKilograms = input.nextDouble();

        System.out.print("Enter the height of the body in metres: ");
        double heightInMetres = input.nextDouble();

        double bmi = weightInKilograms / (heightInMetres * heightInMetres);

        System.out.printf("The body mass index is: %f", bmi);

    }
}
