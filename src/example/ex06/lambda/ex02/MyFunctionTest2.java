package example.ex06.lambda.ex02;

public class MyFunctionTest2 {
    public static void main(String[] args) {
        MyFunction2 a = () -> System.out.println("Hello");
        a.print();

        a = () -> System.out.println("world");
        a.print();
    }
}
