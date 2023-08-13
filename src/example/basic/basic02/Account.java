package example.basic.basic02;

public class Account {
    private long balance;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InsufficientBalanceException {
        if (balance < money) {
            throw new InsufficientBalanceException("잔고 부족 : " + (money - balance) + "원이 부족");
        }
        balance -= money;
    }
}
