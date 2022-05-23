package arrays;

import java.util.Arrays;

public class Population {



    public static void main(String[] args) {
        int[] numbers = new int[8];
        numbers[0] = 69;
        numbers[1] = 420;
        numbers[2] = 666;
        numbers[3] = 13;
        numbers[4] = 4;
        numbers[5] = 27;
        numbers[6] = 39;
        numbers[7] = 43;

        int total = 0;

        for(int counter = 0; counter<numbers.length; counter++){
            total += numbers[counter];

        }

        System.out.printf("The total sum of numbers in the array is: %d", total);

        // System.out.println(Arrays.toString(numbers));
    }


}
