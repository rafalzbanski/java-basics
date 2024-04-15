package classes.ex7;

import java.util.ArrayList;

public class Bank {
    private final ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(String accountHolder, double initialBalance) {
        Account newAccount = new Account(accountHolder, initialBalance);
        accounts.add(newAccount);
        System.out.println("Account created for " + accountHolder + " with initial balance: $" + initialBalance);
    }

    public void removeAccount(String accountHolder) {
        for (Account account : accounts) {
            if (account.getAccountHolder().equals(accountHolder)) {
                accounts.remove(account);
                System.out.println("Account for " + accountHolder + " removed.");
                return;
            }
        }
        System.out.println("Account for " + accountHolder + " not found.");
    }

    public void deposit(String accountHolder, double amount) {
        for (Account account : accounts) {
            if (account.getAccountHolder().equals(accountHolder)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account for " + accountHolder + " not found.");
    }

    public void withdraw(String accountHolder, double amount) {
        for (Account account : accounts) {
            if (account.getAccountHolder().equals(accountHolder)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account for " + accountHolder + " not found.");

    }
}