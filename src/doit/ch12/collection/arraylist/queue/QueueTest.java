package doit.ch12.collection.arraylist.queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");

        // 맨 앞에서부터 삭제
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
