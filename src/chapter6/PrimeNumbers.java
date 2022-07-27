package chapter6;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);

        System.out.printf("");
        int primeNumber = prime.nextInt();

        isPrimeNumber(primeNumber);
    }

    private static boolean isPrimeNumber(int primeNumber) {
        if (primeNumber <= 1){
            System.out.printf("%d is not a prime number", primeNumber);
            return false;
        }

        for (int i = 2; i < primeNumber; i++){
            if (primeNumber % i == 0){
                System.out.printf("%d is not a prime number", primeNumber);
                return false;
            }
        }

        System.out.printf("%d is a prime number", primeNumber);
        return true;
    }
}
