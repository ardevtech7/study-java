package doit.ch12.collection.arraylist.stack;

import java.util.ArrayList;

// ArrayList 로 Stack(LIFO) 구현
public class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    // 삽입
    public void push(String data) {
        arrayStack.add(data); // 스택의 맨 뒤에 추가
    }

    // 삭제
    public String pop() {
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("스택이 비어있습니다.");
            return null;
        }

        return (arrayStack.remove(len - 1)); // 맨 뒤에 있는 자료 반환하고, 배열에서 제거
    }
}
