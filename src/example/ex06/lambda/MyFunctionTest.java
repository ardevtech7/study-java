package example.ex06.lambda;

public class MyFunctionTest {
    public static void main(String[] args) {
        MyFunction add = (x, y) -> x + y;
        MyFunction sub = (x, y) -> x - y;

        System.out.println(add.calc(1,2));
        System.out.println(sub.calc(5,2));
    }
}
