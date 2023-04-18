package doit.ch09.ex01;

// Player 는 한 번에 하나의 레벨 상태이므로 level 변수에 레벨에 해당하는 인스턴스를 대입
public class Player {
    PlayerLevel playerLevel;

    // 디폴트 생성자. 처음 생성되면, Beginner 로 시작
    public Player() {
        playerLevel = new BeginnerLever();
        playerLevel.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return playerLevel;
    }

    // 레벨 변경 메서드
    // 매개변수 자료형은 모든 레벨로 변환 가능한 playerLevel
    // 현재 자신의 level 을 매개변수로 받은 level 로 변경
    public void upgradeLever(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
        playerLevel.showLevelMessage();
    }

    // PlayerLevel 의 템플릿 메서드 go() 호출
    public void play(int count) {
        playerLevel.go(count);
    }

}
