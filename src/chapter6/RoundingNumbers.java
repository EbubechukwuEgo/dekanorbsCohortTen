package chapter6;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();

        double y = Math.floor(x + 0.5);

        int yValue = (int)y;

        System.out.printf("The original number is %f, while the rounded up number is %d", y, yValue);
    }
}
