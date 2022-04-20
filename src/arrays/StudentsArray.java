package arrays;

import java.util.Scanner;

public class StudentsArray {

    public static void main(String[] args){
        Scanner luffy = new Scanner(System.in);

        System.out.println("How many students are registered in class? ");
        int students = luffy.nextInt();

        System.out.println("How many subjects do these students take? ");
        int subjects = luffy.nextInt();

        int[][] grades = new int[students][subjects];

        for(int i = 0; i<students; i++){
            for(int j = 0; j<subjects; i++){
                System.out.println("Enter a grade: ");
               int grade = luffy.nextInt();
               grades[i][j] = grade;
            }
        }

        for(int i = 0; i < students;i++){
            System.out.print("student");
            for(int j = 0; j < subjects; j++){
                System.out.print(grades[i][j] + "  ");
            }

            System.out.println();
        }



    }
}
