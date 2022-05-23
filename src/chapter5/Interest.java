package chapter5;

public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on Deposit");

        for (int year = 1; year <= 10; year++){
            // calculate new amount on deposit for specified year
            double amount = principal * Math.pow(1.0 + rate, year);

            // display the year and the amount
            System.out.printf("%4d%, 20.2f%n", year, amount);
        }
    }
}
