package example.ex09;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // 값 추가
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);

        // 값 변경
        linkedList.add(2, 2); // [1, 3, 2, 5, 7, 9]

        // 값 검색
        boolean contains = linkedList.contains(7); // true
        int index = linkedList.indexOf(9); // 5

        // 값 삭제
        linkedList.removeFirst(); // [3, 2, 5, 7, 9]
        linkedList.removeLast(); // [3, 2, 5, 7]
        linkedList.remove(); // 첫번째 데이터 삭제, [2, 5, 7]
        linkedList.clear(); // 모든 데이터 삭제
        System.out.println(linkedList);
    }
}
