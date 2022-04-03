package eBanking;

public class Account {

    private final String ACCOUNT_NUMBER;
    private String accountName;
    private int balance;

    public Account(String accountNumber, String firstName, String lastName, String pin) {
        ACCOUNT_NUMBER = accountNumber;
        accountName = firstName + " " + lastName;
    }

    public String getACCOUNT_NUMBERUMBER() {
        return ACCOUNT_NUMBER;
    }

    public String getAccountName() {
        return accountName;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance(String s) {
        return balance;
    }


}
