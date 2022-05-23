package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SuperStudentArray {
    public static void main(String[] args) {
        Scanner zoro = new Scanner(System.in);

        System.out.print("How many students are registered? ");
        int students = zoro.nextInt();

        System.out.println("How many subjects are offered? ");
        int subjects = zoro.nextInt();

        int[][] grades = new int[students][subjects];

        System.out.println(Arrays.deepToString(grades));

        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        for (int a = 0; a < students; a++){
            int student = a+1;
            System.out.printf("Student %d%n", student);
            for (int b = 0; b < subjects; b++){
                int subject = b+1;
                System.out.printf("Subject %d: ", subject);
                int grade = zoro.nextInt();
                grades[a][b] = grade;
                total1 += grades[0][b];
                total2 += grades[1][b];
                total3 += grades[2][b];
            }
            System.out.println(Arrays.deepToString(grades));
            System.out.println(total1);
            System.out.println(total2);
            System.out.println(total3);

        }
    }

    //Highest scoring
    //Lowest
    //Highest scoring in each subject
    //Total score for each student
    //Lowest scoring in each subject
    //Worst and best performing subject for each student
}
