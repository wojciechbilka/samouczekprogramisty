package AccessModifiers;

public class Bank implements BankTransfer {

    // Napisz program, który będzie symulował działanie banku.
    // Bank przeprowadzający operację przesyłu środków pobiera stałą opłatę 1zł od nadawcy przelewu.
    // Jakich modyfikatorów dostępu użyjesz? Dlaczego akurat tych?

    final int FEE = 1;

    @Override
    public void transfer(BankAccount from, BankAccount to, int amount) {
        if (from.getAccountBalance() < amount + FEE) {
            throw new IllegalStateException("Brak wysarczających środków na koncie.");
        }
        from.withdraw(amount + FEE);
        to.deposit(amount);
    }

    public BankAccount openAccount() {
        return new BankAccount();

    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount account1 = bank.openAccount();
        BankAccount account2 = bank.openAccount();

        account1.deposit(100);
        account2.deposit(50);

        bank.transfer(account1, account2, 65);

        System.out.println(account1.getAccountBalance());
        System.out.println(account2.getAccountBalance());
    }
}
