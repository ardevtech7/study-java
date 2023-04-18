package doit.ch09.ex01;

public class BeginnerLever extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("run 1");
    }

    @Override
    public void jump() {
        System.out.println("점프 불가");
    }

    @Override
    public void turn() {
        System.out.println("턴 불가");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("초보 레벨");
    }
}
