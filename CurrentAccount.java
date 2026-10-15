/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankoop;

/**
 *
 * @author ProBook
 */
public class CurrentAccount extends Account {
    private final double overdraftLimit;
    private final double monthlyFee = 10.00;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be greater than zero.");
        } else if (balance - amount < -overdraftLimit) {
            System.out.println("Withdrawal rejected: overdraft limit exceeded.");
        } else {
            balance -= amount;
            System.out.println("Current withdrawal: $" + amount);
        }
    }
     @Override
    public void endOfMonth() {
        balance -= monthlyFee;

        System.out.println("Monthly maintenance fee deducted: $" + monthlyFee);
    }
}
