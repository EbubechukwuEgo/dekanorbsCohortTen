package chapter2;

import java.util.Scanner;

public class TwoIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number here:");
        int number1 = scan.nextInt();
        System.out.print("Enter second number here:");
        int number2 = scan.nextInt();

        if ( (number1 * 3) % (number2 * 2) == 0 ){
            System.out.println("The first number when tripled is a multiple of the second number when doubled");
        } else {
            System.out.println("Does not apply.");
        }


    }
}
