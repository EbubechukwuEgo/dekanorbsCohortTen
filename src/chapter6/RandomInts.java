package chapter6;

import java.security.SecureRandom;

public class RandomInts {
    public static void main(String[] args) {
        SecureRandom randomInts = new SecureRandom();

        for (int counter = 1; counter <= 20; counter++){
            int face = 1 + randomInts.nextInt(6);

            System.out.printf("%d  ", face);

            if (counter % 5 == 0){
                System.out.println();
            }
        }
    }
}
