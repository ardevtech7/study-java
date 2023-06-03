package example.ex09;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop(); // [1, 3, 4]
        Integer peek = stack.peek(); // 4, 가장 상단의 값 출력
        System.out.println(peek); //
        System.out.println(stack);
    }
}
