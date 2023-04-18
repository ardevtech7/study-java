package doit.ch09.ex01;

public class AdvancedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("run 2");
    }

    @Override
    public void jump() {
        System.out.println("jump 2");
    }

    @Override
    public void turn() {
        System.out.println("turn 2");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("중급 레벨");
    }
}
