package doit.ch09.ex01;

/*
    PlayerLevel
    - BeginnerLevel
    - AdvancedLevel
    - SuperLevel
 */
public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    // 재정의 불가
    final public void go(int count) {
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}
