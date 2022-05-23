package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        int numerator = input("Enter numerator");
        int denominator = input("Enter denominator");

        try {
            int approximateQuotient = numerator / denominator;
            display(approximateQuotient+"");
        } catch (ArithmeticException e){
            display("Don't even dare put zero there. Chinga tu madre!");
        }

    }

    private static void display(String prompt) {
        System.out.println(prompt);
    }

    private static int input(String prompt){
        display(prompt);
        Scanner input  = new Scanner(System.in);
        int number = 0;
        try {
            return input.nextInt();
        } catch (InputMismatchException e){
            display("Buzz off, you dolt!");
            System.exit(3);
        }
        return number;
    }
}
