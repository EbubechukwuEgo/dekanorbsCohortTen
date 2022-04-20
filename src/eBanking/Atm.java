package eBanking;

import java.util.Scanner;

public class Atm {
    private static Scanner bambino = new Scanner(System.in);
    private static Bank zuBank = new Bank("ZuBank",20);
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp(){
        String prompt = """
                Welcome to ZuBank,
                Press me softly with your song
                1 -> To create account.
                2 -> To deposit.
                3 -> To withdraw.
                4 -> To transfer.
                5 -> To check balance.
                6 -> To exit.
                """;
        System.out.println(prompt);
        int userResponse = bambino.nextInt();
        switch (userResponse){
            case 1:
                createAccount();
                break;
            case 2:
                putMoney();
                break;
            case 3:
                commotMoney();
                break;
            case 4:
                sendUrgent2h();
                break;
            case 5:
                checkBalance();
                break;
            case 6:
                exit();
                break;
            default:
                runApp();
        }
    }

    private static void exit() {
    }

    private static void checkBalance() {
    }

    private static void sendUrgent2h() {
        System.out.println("Account number");
        String senderAccountNo = bambino.nextLine();
    }

    private static void commotMoney() {
        System.out.println("Which account?");
        String accountNo = bambino.nextLine();
        System.out.println("");
    }

    private static void putMoney() {
        System.out.println("Which account? ");
        String accountNo = bambino.nextLine();
        Account account = zuBank.findAccount(Integer.parseInt(accountNo));
        System.out.println("The account name is "+account.getAccountName());
        System.out.println("How much");
        int amount = bambino.nextInt();
        zuBank.deposit(amount, accountNo);

        System.out.println();
        System.out.println(account);
        System.out.println();
        runApp();
    }

    private static void createAccount() {
        System.out.println("Enter your first name: ");
        String firstName = bambino.nextLine();
        System.out.println("Enter your surname: ");
        String lastName = bambino.nextLine();
        System.out.println("Enter your pin: ");
        String pin = bambino.nextLine();
       // Account savedAccount = zuBank.register(firstName, lastName, pin);
        // System.out.println(savedAccount);
        runApp();
    }
}
