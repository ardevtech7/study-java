package example.ex03.abstractex.ex02;

public class Begginer extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump(int count) {
        System.out.println("점프 불가능");
    }

    @Override
    public void turn() {
        System.out.println("턴 불가능");
    }

    @Override
    public void showInfo() {
        System.out.println("===초급자===");
    }
}
