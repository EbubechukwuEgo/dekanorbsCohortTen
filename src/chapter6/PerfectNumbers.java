package chapter6;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner perfect = new Scanner(System.in);

        System.out.print("Insert number here: ");
        int perfectNumber = perfect.nextInt();

        isPerfect(perfectNumber);
    }

    private static boolean isPerfect(int perfectNumber) {
        int sum = 0;
        for (int i = 1; i <= perfectNumber/2; i++){
            if (perfectNumber % i == 0){
                sum += i;
            }
        }
        if (sum == perfectNumber){
            System.out.printf("%d is a perfect number", perfectNumber);
            return true;
        } else {
            System.out.printf("%d is not a perfect number", perfectNumber);
            return false;
        }
    }
}
