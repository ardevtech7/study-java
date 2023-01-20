package example.ex05.collection.arraylist;

import java.util.ArrayList;

/**
 * Stack -> LIFO
 */
public class MyStack {
    private ArrayList<String> arrayStack= new ArrayList<>();

    // push
    public void push(String data) {
        arrayStack.add(data);
    }

    // pop
    public String pop() {
        int len = arrayStack.size();

        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        // 맨 뒤에 있는 자료 반환하고 배열에서 제거
        return (arrayStack.remove(len-1));
    }
}
