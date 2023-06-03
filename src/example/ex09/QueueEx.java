package example.ex09;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(5);

        Integer peek = queue.peek(); // 1
        queue.poll(); // 상단에 위치한 데이터 추출하고, 제거. [3, 5]

        int a = 1;
        int b = 2;
        System.out.println(a | b);
    }
}
