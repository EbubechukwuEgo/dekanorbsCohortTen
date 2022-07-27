package chapter6;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner digits = new Scanner(System.in);

        System.out.print("Insert digit here: ");
        int digit = digits.nextInt();

        addAllDigits(digit);
    }

    private static int addAllDigits(int digit) {
        int sum;
        for (sum = 0; digit != 0; digit=digit/10){
            sum += digit%10;
        }

        System.out.printf("The sum of digits is %d", sum);

        return sum;
    }
}
