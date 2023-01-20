package example.ex05.collection.arraylist;

public class MyQueueTest {
    public static void main(String[] args) {
        Myqueue myqueue = new Myqueue();
        myqueue.enQueue("A");
        myqueue.enQueue("B");
        myqueue.enQueue("C");
        System.out.println(myqueue.deQueue());
        System.out.println(myqueue.deQueue());
        System.out.println(myqueue.deQueue());
    }
}
