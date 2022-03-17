package tddClass;

public class Account {

    private int balance;

    public void deposit(int amount) {
        if (amount<0) {amount = 0;}
        balance = amount + balance;
    }

    public void withdraw(int amount){
        balance = amount + balance;
    }

    public int getBalance() {
        return balance;
    }
}
