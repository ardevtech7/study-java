package example.ex03.abstractex.ex02;

public class Super extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("더 빨리 달립니다.");
    }

    @Override
    public void jump(int count) {
        System.out.println("더 높이 점프합니다.");
    }

    @Override
    public void turn() {
        System.out.println("한바퀴 돕니다.");
    }

    @Override
    public void showInfo() {
        System.out.println("===고급자===");
    }
}
