package doit.ch10.ex02;

import java.util.ArrayList;

// FIFO
public interface Queue {
    void enQueue(String title); // 배열의 맨 마지막에 추가
    String deQueue(); // 배열의 맨 처음 항목 반환
    int size(); // 현재 큐에있는 개수 반환
    ArrayList<String> getArrayList();
}
