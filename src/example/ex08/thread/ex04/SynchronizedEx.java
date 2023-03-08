package example.ex08.thread.ex04;

public class SynchronizedEx {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        User1Thread user1Thread = new User1Thread();
        user1Thread.setCalculator(calculator);
        user1Thread.start(); // setMemory1() 동기화 메소드 실행하면, calculator 객체는 잠기기 때문에 User2Thread 는 접근 불가

        User2Thread user2Thread = new User2Thread();
        user2Thread.setCalculator(calculator);
        user2Thread.start();
    }
}
