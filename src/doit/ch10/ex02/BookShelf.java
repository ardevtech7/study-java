package doit.ch10.ex02;

import java.util.ArrayList;

// 책을 넣은 순서대로 꺼내도록 책장 구현
public class BookShelf extends Shelf implements Queue {

    // 상속받은 Shelf 의 멤버변수 사용
    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int size() {
        return getCount();
    }

    @Override
    public ArrayList<String> getArrayList() {
        return getShelf();
    }

}
