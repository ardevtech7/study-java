package doit.ch12.collection.arraylist.queue;

import java.util.ArrayList;

// ArrayList 로 Queue(FIFO) 구현
public class Queue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    // 삽입
    public void enQueue(String data) {
        arrayQueue.add(data); // 큐의 맨 뒤에 추가
    }

    // 삭제
    public String deQueue() {
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("큐가 비어있습니다.");
            return null;
        }

        return arrayQueue.remove(0); // 큐의 맨 앞에서 삭제
    }
}
