package example.ex05.collection.arraylist;

import java.util.ArrayList;

/**
 * Queue -> FIFO
 */
public class Myqueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        }
        // 맨 앞의 자료 반환하고 배열에서 제거
        return(arrayQueue.remove(0));
    }
}
