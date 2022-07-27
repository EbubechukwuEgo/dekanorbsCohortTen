package chapter6;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number here: ");
        int number = scanner.nextInt();

        isDivisible(number);
    }

    private static boolean isDivisible(int number) {

        for (int i = 1; i <= 10; i++){

            if (number % 5 == 0){
                System.out.printf("%d is divisible by five%n", number);
                return true;
            } else {
                System.out.printf("%d is not divisible by five%n", number);
                return false;
            }


        }

        return true;
    }
}
