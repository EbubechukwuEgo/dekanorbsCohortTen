package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        Scanner yusuke = new Scanner(System.in);
        System.out.print("Insert number of elements here: ");
        int kurama = yusuke.nextInt();

        int[] hiei = new int[kurama];

        System.out.println("Enter elements of array here: ");
        for (int i = 0; i < kurama; i++){
            hiei[i] = yusuke.nextInt();
        }

        for (int i = 0; i < kurama; i++){
            System.out.println(Arrays.toString(hiei));
            isDivisible(hiei[i]);
        }
    }

    private static boolean isDivisible(int hiei) {
        if (hiei % 5 == 0){
            System.out.printf("%d is divisible by five%n", hiei);
            return true;
        } else {
            System.out.printf("%d is not divisible by five%n", hiei);
            return false;
        }
    }
}
