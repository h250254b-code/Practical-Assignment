package bankoop;

public class SavingsAccount extends Account {

    private final double minimumBalance;
    private final double interestRate = 0.05;

    public SavingsAccount(String accountNumber, double balance, double minimumBalance) {
        super(accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal must be greater than zero.");

        } else if (balance - amount < minimumBalance) {
            System.out.println(
                "Savings withdrawal rejected: minimum balance would be violated."
            );

        } else {
            balance -= amount;
            System.out.println("Savings withdrawal: $" + amount);
        }
    }

    @Override
    public void endOfMonth() {

        double interest = balance * interestRate;
        balance += interest;

        System.out.println("Savings interest added: $" + interest);
    }
}