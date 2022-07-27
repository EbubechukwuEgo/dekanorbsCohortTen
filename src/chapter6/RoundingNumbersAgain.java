package chapter6;

import java.util.Scanner;

public class RoundingNumbersAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        roundToInteger(x);
        roundToTenths(x);
        roundToHundredths(x);
        roundToThousandths(x);


    }

    private static void roundToThousandths(int number) {
        double y = Math.floor(number * 1000 + 0.5) / 100;
        System.out.printf("y rounded up to the nearest thousandth is %.3f", y);
    }

    private static void roundToHundredths(int number) {
        double y = Math.floor(number * 100 + 0.5) / 100;
        System.out.printf("y rounded up to the nearest hundredth is %.2f%n", y);
    }

    private static void roundToTenths(int number) {
        double y = Math.floor(number * 10 + 0.5) / 100;
        System.out.printf("y rounded up to the nearest tenth is %.1f%n", y);
    }

    private static void roundToInteger(int number) {
        double y = Math.floor(number + 0.5) / 100;
        int yValue = (int)y;
        System.out.printf("y rounded to the nearest integer is %d%n", yValue);
    }
}
