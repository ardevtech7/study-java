package example.ex03.interfaceex.ex05;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("가");
        shelfQueue.enQueue("나");
        shelfQueue.enQueue("다");

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());

    }
}
