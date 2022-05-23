package chapter4;

public class PowersUpToFour {
    public static void main(String[] args) {
        System.out.printf("%s%10s%10s%10s%n", "N", "N^2", "N^3", "N^4");

        for (int n = 1; n <= 5; n++){
            int number = n;
            int nSquared = number * number;
            int nCubed = number * nSquared;
            int nToTheFourthPower = nCubed * number;

            System.out.printf("%d%, 10.2d%, 10.2d%, 10.2d%n", number, nSquared, nCubed, nToTheFourthPower);
        }
    }
}
