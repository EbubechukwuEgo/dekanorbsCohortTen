package chapter4;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10){
            System.out.println("Enter grade: ");
            int nextGrade = input.nextInt();
            total += nextGrade;
            gradeCounter++;
        }

        double average = total / 10;
        System.out.printf("The class average is: %f", average);
    }
}
