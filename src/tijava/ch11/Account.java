package tijava.ch11;

// Account(은행 계좌) 클래스의 출금(withdraw) 메소드에서 잔고(balance) 필드와 출금액(매개값) 을 비교해서
// 잔고가 부족하면 InsufficientException 발생하시고, throws 한다.
// AccountEx 은 withdraw() 메소드를 호출할 때, 예외 처리를 한다.
public class Account {
    private long balance; // 잔고

    public Account() {
    }

    public long getBalance() {
        return this.balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) throws InSufficientException {
        if (balance < money) {
            throw new InSufficientException("잔고 부족 : " + (money-balance) + " 모자람");
        }
        balance -= money;
    }

}
