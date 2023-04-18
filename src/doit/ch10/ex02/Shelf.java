package doit.ch10.ex02;

import java.util.ArrayList;

// BookSelf(책장) 의 더 큰 개념은 Shelf(선반)
public class Shelf {
    // 자료를 순서대로 저장할 리스트 선언
    protected ArrayList<String> shelf;

    // 디폴트 생성자로 Shelf 클래스를 생성하면, 리스트도 생성
    public Shelf() {
        shelf = new ArrayList<>();
    }

    public ArrayList<String> getShelf() {
        return this.shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
