package chapter3;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        if(balance > 0.0){
            this.balance = balance;
        }

    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0) { // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
        }
    }
    public double getBalance() {
        return balance;
    }

    public void withdrawal(double withdrawal, double balance){
        if(withdrawal > balance){
            this.balance = balance;
            System.out.println("Withdrawal amount exceeded account balance.");
        }
    }

    // method to set the name in the object
    public void setName(String name) {
        this.name = name; // store the name
    }
    // method to retrieve the name from the object
    public String getName() {
        return name; // return value of name to caller
    }

}
