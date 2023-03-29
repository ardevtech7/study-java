package tijava.ch11;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account();
        // 예금하기
        account.deposit(5000);
        System.out.println("예금액 : " + account.getBalance());

        try {
            account.withdraw(10000);
        } catch (InSufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
