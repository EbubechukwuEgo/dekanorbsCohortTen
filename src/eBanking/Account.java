package eBanking;

public class Account {

    private final String ACCOUNT_NUMBER;
    private String accountName;
    private int balance;
    private String pin;

    public Account(String accountNumber, String firstName, String lastName, String pin) {
        ACCOUNT_NUMBER = accountNumber;
        accountName = firstName + " " + lastName;
        this.pin = pin;
    }

    public String getAccountNo() {
        return ACCOUNT_NUMBER;
    }

    public String getAccountName() {
        return accountName;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance(String pin) {
        if(pin.equals(this.pin)) return balance;
        return 0;
    }

    public void withDraw(int amount, String pin){ if (pin.equals(this.pin)) balance -= amount;}

    @Override
    public String toString(){
        String toReturn = String.format("""
                Account Name:    %s
                Account No.:      %s
                Balance:         %d
                """, accountName, getAccountNo(), balance);
        return toReturn;
    }

}
