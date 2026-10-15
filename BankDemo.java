package bankoop;

import java.util.ArrayList;
import java.util.List;

public class BankDemo {

    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        Account savings = new SavingsAccount("S001", 1000.00, 500.00);
        Account current = new CurrentAccount("C001", 500.00, 300.00);

        accounts.add(savings);
        accounts.add(current);

        System.out.println("===== BANK ACCOUNT DEMO =====");

        for (Account account : accounts) {

            System.out.println("\nStarting balance: $" + account.getBalance());

            account.withdraw(200.00);

            System.out.println("Balance after withdrawal: $" 
                    + account.getBalance());

            account.endOfMonth();

            System.out.println("Balance after month-end: $" 
                    + account.getBalance());
        }

        System.out.println("\n===== SAVINGS EDGE CASE =====");

        Account savingsTest =
                new SavingsAccount("S002", 600.00, 500.00);

        savingsTest.withdraw(200.00);

        System.out.println("Savings balance: $" 
                + savingsTest.getBalance());

        System.out.println("\n===== CURRENT ACCOUNT OVERDRAFT =====");

        Account currentTest =
                new CurrentAccount("C002", 100.00, 300.00);

        currentTest.withdraw(250.00);

        System.out.println("Current balance: $" 
                + currentTest.getBalance());
    }
}