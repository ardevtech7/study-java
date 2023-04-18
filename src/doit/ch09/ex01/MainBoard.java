package doit.ch09.ex01;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        System.out.println();

        AdvancedLevel advancedLevel = new AdvancedLevel();
        player.upgradeLever(advancedLevel);
        player.play(2);
        System.out.println();

        SuperLevel superLevel = new SuperLevel();
        player.upgradeLever(superLevel);
        player.play(3);

    }
}
