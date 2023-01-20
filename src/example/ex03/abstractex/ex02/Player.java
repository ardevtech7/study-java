package example.ex03.abstractex.ex02;

public class Player {

//    PlayerLevel level = new Begginer();
    private PlayerLevel level;

    public Player() {
        level = new Begginer();
        level.showInfo();
    }

    // 매개변수의 자료형은 모든 레벨로 변환 가능한 PlayerLevel
    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showInfo();
    }

    public void play(int count) {
        level.go(count);
    }
}
