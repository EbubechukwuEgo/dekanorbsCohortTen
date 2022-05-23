package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentsArray {

    public static void main(String[] args){
        Scanner luffy = new Scanner(System.in);

        System.out.println("How many students are registered in class? ");
        int students = luffy.nextInt();

        System.out.println("How many subjects do these students take? ");
        int subjects = luffy.nextInt();

        int[][] grades = new int[students][subjects];

        System.out.println(Arrays.deepToString(grades));

        int total = 0;

        for (int i = 0; i < students; i++){
            for (int j = 0; j < subjects; j++){
                int student = i+1;
                System.out.printf("Student %d%n", student);
                System.out.println("Enter student grade: ");
                int grade = luffy.nextInt();
                grades[i][j] = grade;
                total += grade;
            }
            System.out.println(Arrays.deepToString(grades));
            System.out.println(total);
           }
        int average = total/grades.length;
        System.out.println(average);

        }



    }

