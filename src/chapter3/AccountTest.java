package chapter3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Philadelphia Eagles", 9.8);
        Account account2 = new Account("Pittsburgh Steelers", 9.8);



       // String theName = input.nextLine(); // read a line of text
       // account1.setName(theName);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("Initial name is: %s balance: %.2f", account1.getName(), account1.getBalance());
        System.out.printf("Initial name is: %s balance: %.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%n adding to account2 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("Initial name is: %s balance: %.2f", account1.getName(), account1.getBalance());
        System.out.printf("Initial name is: %s balance: %.2f%n%n", account2.getName(), account2.getBalance());

        System.out.printf("Name in object myAccount is:%n%s%n", account1.getName(), account1.getBalance());
    }
}
