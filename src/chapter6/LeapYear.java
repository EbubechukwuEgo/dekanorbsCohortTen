package chapter6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner years = new Scanner(System.in);

        System.out.print("Insert year here: ");
        int year = years.nextInt();

        isLeapYear(year);
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 400 == 0){
            System.out.printf("%d is a leap year", year);
            return true;
        } else {
            System.out.printf("%d is not a leap year", year);
            return false;
        }
    }
}
