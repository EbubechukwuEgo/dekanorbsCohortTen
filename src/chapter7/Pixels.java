package chapter7;

import java.util.Scanner;

public class Pixels {
    public static void main(String[] args) {

        System.out.println("How many values do you want to insert?: ");
        Scanner scan = new Scanner(System.in);
        int pixel = scan.nextInt();

        int[] pixels = new int[pixel];
        System.out.println("Insert values here: ");
        for (int i = 0; i < pixels.length; i++){
            pixels[i] = scan.nextInt();
        }

        System.out.println("Quantized values are: ");

        for (int i = 0; i < pixels.length; i++){
            if (pixels[i] >= 0 && pixels[i] <= 20) pixels[i] = 10;
            else if (pixels[i] >= 21 && pixels[i] <= 40) pixels[i] = 30;
            else if (pixels[i] >= 41 && pixels[i] <= 60) pixels[i] = 50;
            else if (pixels[i] >= 61 && pixels[i] <= 80) pixels[i] = 70;
            else if (pixels[i] >= 81 && pixels[i] <= 100) pixels[i] = 90;
            else if (pixels[i] >= 101 && pixels[i] <= 120) pixels[i] = 110;
            else if (pixels[i] >= 121 && pixels[i] <= 140) pixels[i] = 130;
            else if (pixels[i] >= 141 && pixels[i] <= 160) pixels[i] = 150;
            else if (pixels[i] >= 161 && pixels[i] <= 180) pixels[i] = 170;
            else pixels[i] = 190;
            System.out.println(pixels[i]);
        }

    }
}
