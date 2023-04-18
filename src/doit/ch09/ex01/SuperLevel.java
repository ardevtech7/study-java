package doit.ch09.ex01;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("run 3");
    }

    @Override
    public void jump() {
        System.out.println("jump 3");
    }

    @Override
    public void turn() {
        System.out.println("turn 3");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("고급 레벨");
    }
}
