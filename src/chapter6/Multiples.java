package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner lagann = new Scanner(System.in);

        System.out.print("Enter the no. of rows: ");
        int simon = lagann.nextInt();
        System.out.print("Enter the no. of columns: ");
        int nia = lagann.nextInt();

        int[][] gurren = new int[simon][nia];

        for (int i = 0; i < simon; i++){
            for (int j = 0; j < nia; j++){
                System.out.println("Enter elements of the array here: ");
                gurren[i][j] = lagann.nextInt();
            }
        }

        for (int i = 0; i < simon; i++){
            for (int j = 0; j < nia; j++){
                System.out.println(Arrays.deepToString(gurren));
            }
            isMultiple(gurren[i]);
        }

        System.out.println();



    }

    private static boolean isMultiple(int[] gurren) {
        if (gurren[1] % gurren[0] == 0){
            System.out.printf("The second integer, %d, is a multiple of the first integer, %d%n", gurren[1], gurren[0]);
        } else {
            System.out.printf("The second integer, %d, is not a multiple of the first integer, %d%n", gurren[1], gurren[0]);
        }



//        if (nia % simon == 0) {
//            System.out.printf("The second integer, %d, is a multiple of the first integer, %d", nia, simon);
//            return true;
//        } else {
//            System.out.printf("The second integer, %d, is not a multiple of the first integer, %d", nia, simon);
//            return false;
//        }

        return true;
    }
}
