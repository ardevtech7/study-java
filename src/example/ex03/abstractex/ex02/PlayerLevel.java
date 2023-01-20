package example.ex03.abstractex.ex02;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump(int count);
    public abstract void turn();
    public abstract void showInfo();

    final public void go(int count) {
        run();
        for (int i = 0; i < count; i++) {
            jump(count);
        }
        turn();
    }
}
