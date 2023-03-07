package example.ex03.interfaceex.ex05;

/**
 * 큐 = 처음 들어간 자료부터 꺼내 쓰는 것, FIFO
 * 먼저 들어 온 자료를 꺼내는 기능
 */
public interface Queue {
    void enQueue(String title); // 배열의 맨 마지막에 추가
    String deQueue(); // 배열의 맨 처음 항목 반환
    int getSize(); // 현재 Queue 에 있는 개수 반환
}
