package bankoop;

public abstract class Account {
    
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit must be greater than zero.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double amount);

    public abstract void endOfMonth();
}