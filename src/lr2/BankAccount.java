package lr2;

public class BankAccount implements BankTransactions {
    private float balance;

    public BankAccount(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float money) {
        balance += money;
    }

    public void removal(float money) {
        balance -= money;
    }
}
