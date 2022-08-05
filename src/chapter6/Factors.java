package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner bebop = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int spike = bebop.nextInt();
        System.out.print("Enter no of columns: ");
        int jet = bebop.nextInt();

        int[][] faye = new int[spike][jet];

        for (int i = 0; i < spike; i++){
            for (int j = 0; j < jet; j++){
                System.out.println("Enter elements here: ");
                faye[i][j] = bebop.nextInt();
            }
        }

        for (int i = 0; i < spike; i++){
            for (int j = 0; j < jet; j++){
                System.out.println(Arrays.deepToString(faye));
            }
            isFactor(faye[i]);
        }
    }

    private static void isFactor(int[] faye) {
        if (faye[0] % faye[1] == 0){
            System.out.printf("The second integer, %d, is a factor of the first integer, %d.%n", faye[1], faye[0]);
        } else {
            System.out.printf("The second integer, %d, is not a factor of the first integer, %d.%n", faye[1], faye[0]);
        }

    }
}
