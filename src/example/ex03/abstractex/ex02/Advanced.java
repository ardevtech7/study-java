package example.ex03.abstractex.ex02;

public class Advanced extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump(int count) {
        System.out.println("높이 점프합니다.");
    }

    @Override
    public void turn() {
        System.out.println("턴 불가능");
    }

    @Override
    public void showInfo() {
        System.out.println("===중급자===");
    }
}
