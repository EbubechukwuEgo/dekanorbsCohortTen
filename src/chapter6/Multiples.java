package chapter6;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner lagann = new Scanner(System.in);

        System.out.print("Enter value for the first integer: ");
        int simon = lagann.nextInt();
        System.out.print("Enter value for the second integer: ");
        int nia = lagann.nextInt();

        isMultiple(simon, nia);

    }

    private static boolean isMultiple(int simon, int nia) {
        if (nia % simon == 0) {
            System.out.printf("The second integer, %d, is a multiple of the first integer, %d", nia, simon);
            return true;
        } else {
            System.out.printf("The second integer, %d, is not a multiple of the first integer, %d", nia, simon);
            return false;
        }
    }
}
