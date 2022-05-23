package arrays;

import java.util.Arrays;

public class Multidimensions {

    public static void main(String[] args) {

        int[][] celtics = new int[3][3];
        celtics[0][0] = 17;
        celtics[0][1] = 35;
        celtics[0][2] = 34;
        celtics[1][0] = 6;
        celtics[1][1] = 33;
        celtics[1][2] = 10;
        celtics[2][0] = 18;
        celtics[2][1] = 32;
        celtics[2][2] = 15;

        int total = 0;

        System.out.println(Arrays.deepToString(celtics));

        for (int xcounter = 0; xcounter <celtics.length; xcounter++){
            for (int ycounter = 0; ycounter<celtics.length; ycounter++){
                total += celtics[xcounter][ycounter];
            }
        }

        System.out.printf("The total sum of numbers in the multidimensional array is: %d", total);

    }
}
