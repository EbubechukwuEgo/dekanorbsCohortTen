package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIMAN {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int primero = random.nextInt(10);
        int segundo = random.nextInt(10);

        int product = primero * segundo;

        System.out.printf("How much is %d times %d%n", primero, segundo);
        int solution = input.nextInt();
        boolean tryAgain = true;

        while (tryAgain){
            if (solution == product){
                tryAgain = false;
                System.out.println("Very good!\nWant to try another question?");
                askAnotherQuestion();
            } else {
                System.out.println("No please try again!");
                System.out.printf("How much is %d times %d%n", primero, segundo);
                solution = input.nextInt();
            }
        }
    }

    private static void askAnotherQuestion() {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        String nextQuestion = input.nextLine();

        int tres = random.nextInt(10);
        int cuatro = random.nextInt(10);

        int producto = tres * cuatro;

        System.out.printf("How much is %d times %d%n", tres, cuatro);
        int solucion = input.nextInt();
        boolean tryAgain1 = true;

        while (tryAgain1){
            if (nextQuestion.equals("Yes")){
                if (solucion == producto){
                    tryAgain1 = false;
                    System.out.println("Very good");
                } else {
                    System.out.println("No please try again!");
                    System.out.printf("How much is %d times %d%n", tres, cuatro);
                    solucion = input.nextInt();
                }
            } else {
                System.out.println("Finished");
            }
        }

    }
}
