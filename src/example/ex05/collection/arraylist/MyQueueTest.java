package example.ex05.collection.arraylist;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myqueue = new MyQueue();
        myqueue.enQueue("A");
        myqueue.enQueue("B");
        myqueue.enQueue("C");
        System.out.println(myqueue.deQueue());
        System.out.println(myqueue.deQueue());
        System.out.println(myqueue.deQueue());
    }
}
