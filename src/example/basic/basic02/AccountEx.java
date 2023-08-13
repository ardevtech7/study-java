package example.basic.basic02;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        try {
            account.withdraw(15000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
