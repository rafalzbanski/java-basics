package classes.ex7;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Adding accounts
        bank.addAccount("John Doe", 1000.0);
        bank.addAccount("Alice Smith", 500.0);

        // Depositing and withdrawing
        bank.deposit("John Doe", 200.0);
        bank.withdraw("Alice Smith", 100.0);

        // Removing an account
        bank.removeAccount("John Doe");

        // Attempting operations on a non-existent account
        bank.deposit("Jane Doe", 300.0);
        bank.withdraw("Bob Smith", 50.0);
    }
}
