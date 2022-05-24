package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SuperStudentArray {
    public static void main(String[] args) {
        helloMessage();
        userInput();
    }

    private static void helloMessage() {
        System.out.println("=========================================================================================");

        System.out.println("Hello. Welcome to the Student Array Advanced Edition. Enter Your Scores Here:");

        System.out.println("=========================================================================================");
    }

    public static void userInput(){
        Scanner zoro = new Scanner(System.in);

        System.out.print("How many students are registered? ");
        int students = zoro.nextInt();

        System.out.print("How many subjects are offered? ");
        int subjects = zoro.nextInt();

        int[][] grades = new int[students][subjects];
        int[][] totalGrades = new int[students][subjects];
        double[][] gradePointAverage = new double[students][subjects];

        System.out.println("=========================================================================================");

        System.out.println(Arrays.deepToString(grades));

        for (int a = 0; a < students; a++){
            int student = a+1;
            System.out.printf("Student %d%n", student);
            for (int b = 0; b < subjects; b++){
                int subject = b+1;
                System.out.printf("Subject %d: ", subject);
                int grade = zoro.nextInt();
                grades[a][b] = grade;
            }
            System.out.println(Arrays.deepToString(grades));
        }

        for (int c = 0; c < students; c++){
            int sum = 0;
            for (int d = 0; d < subjects; d++){
                sum+= grades[c][d];
                totalGrades[c][0] = sum;
                gradePointAverage[c][0] = (sum * 1.0)/ subjects;
            }
        }
        System.out.println("=========================================================================================");

        System.out.printf("%s", "STUDENTS ");

        for (int e = 0; e < subjects; e++){
            System.out.print("SUB" + (e +1) + " ");
        }
        System.out.print("TOTAL    AVERAGE    POSITION");
        System.out.println();

        for (int f = 0; f < students; f++){
            System.out.print("Student " + (f + 1) + "  ");
            for (int g = 0; g < subjects;g++){
                System.out.print(grades[f][g] + "   ");
            }

            for (int g = 0; g < 1; g++){
                System.out.print(totalGrades[f][g]+ "   ");
            }

            for (int g = 0; g < 1; g++){
                System.out.printf("%.2f   ", gradePointAverage[f][g]);
            }
            System.out.println();
        }

        System.out.println("=========================================================================================");
    }

    //Highest scoring
    //Lowest
    //Highest scoring in each subject
    //Total score for each student
    //Lowest scoring in each subject
    //Worst and best performing subject for each student
}
