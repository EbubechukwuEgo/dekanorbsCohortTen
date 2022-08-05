package chapter6;

import java.util.Scanner;

public class Asterisk {
    public static void main(String[] args) {

        Scanner square = new Scanner(System.in);
        System.out.println("Insert number here: ");
        int number = square.nextInt();

        squareOfAsterisks(number);
    }

    private static void squareOfAsterisks(int number) {
        int square = (int) Math.pow(number, 2);
        String asterisks = String.valueOf(square);
        System.out.println();
    }
}
