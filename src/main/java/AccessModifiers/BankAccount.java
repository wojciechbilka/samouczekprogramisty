package AccessModifiers;

public class BankAccount implements Account {
    private double accountBalance;

    BankAccount() {
        this(0);
    }

    BankAccount(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater then 0");
        }
        this.accountBalance += amount;
    }

    public void withdraw(int amount) {
        if (accountBalance <= amount) {
            throw new IllegalArgumentException("Not enough money on account.");
        }
        accountBalance -= amount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
