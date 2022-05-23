package arrays;

import java.util.Arrays;

public class UnspecifiedColumn {
    public static void main(String[] args) {

        int[][] lakers = new int[2][];

        lakers[0] = new int[3];
        lakers[1] = new int[2];

        lakers[0][0] = 32;
        lakers[0][1] = 52;
        lakers[0][2] = 33;

        lakers[1][0] = 34;
        lakers[1][1] = 8;

        int total = 0;

        System.out.println(Arrays.deepToString(lakers));

        for (int rowsCounter = 0; rowsCounter <lakers.length; rowsCounter++){
            for (int columnsCounter = 0; columnsCounter<lakers.length; columnsCounter++){
                total += lakers[rowsCounter][columnsCounter];
            }
        }

        System.out.printf("The total sum of elements in the array is: %d", total);
    }
}
