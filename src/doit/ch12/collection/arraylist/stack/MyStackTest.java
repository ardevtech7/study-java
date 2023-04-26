package doit.ch12.collection.arraylist.stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
