package example.ex03.abstractex.ex02;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        Advanced advanced = new Advanced();
        player.upgradeLevel(advanced);
        player.play(2);

        Super superPlayer = new Super();
        player.upgradeLevel(superPlayer);
        player.play(3);

//        PlayerLevel playerLevel = new Begginer();
//        playerLevel.go(2);
//
//        PlayerLevel playerLevel2 = new Advanced();
//        playerLevel2.run();

    }
}
