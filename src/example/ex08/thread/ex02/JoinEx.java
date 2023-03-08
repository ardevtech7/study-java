package example.ex08.thread.ex02;

public class JoinEx {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join(); // sumThread 작업 끝날 때까지 일시 정지
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("1 ~ 100 합: " + sumThread.getSum());
    }
}
