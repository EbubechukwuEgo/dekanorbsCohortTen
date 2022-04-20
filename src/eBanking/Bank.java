package eBanking;

public class Bank {
    private String name;
    private Account[] accounts;
    private int noOfCustomer;

    public Bank(String bankName, int noOfCustomer) {
        name = bankName;
        accounts = new Account[noOfCustomer];
    }

    public String getName() {
        return name;
    }

    public int getMaxNoOfCustomers() {
        return accounts.length;
    }

    public void register(String firstName, String surname, String pin) {
        String accountNo = (noOfCustomer+1)+"";
        Account account = new Account(accountNo, firstName, surname, pin);
        accounts[noOfCustomer] = account;
        noOfCustomer++;

    }

    public int getNoOfCustomers() {
        return noOfCustomer;
    }

    public Account findAccount(int accountNo){
        int indexOfAccount = accountNo - 1;
        return accounts[indexOfAccount];
    }

    public void deposit(int amount, String accountNo){
        Account account = findAccount(Integer.parseInt(accountNo));
        account.deposit(amount);
    }

    public void withdraw(int amount, String accountNo, String pin) {
        Account account = findAccount(Integer.parseInt(accountNo));
        account.withDraw(amount, pin);
    }

    public void transfer(int amount, String from, String to, String sendersPin) {
        Account senderAccount = findAccount(Integer.parseInt(from));
        Account receiverAccount = findAccount(Integer.parseInt(to));
        senderAccount.withDraw(amount, sendersPin);
        receiverAccount.deposit(amount);
    }
}
