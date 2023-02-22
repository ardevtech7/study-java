package example.ex06.lambda.ex01;

public class MyFunctionTest2 {
    public static void main(String[] args) {
        // 람다식을 매개변수로 전달하기
        MyFunction f = ((x, y) -> x * y);
        printMultiply(f);
    }

    // f 로 (x,y) -> x * y 람다식 전달받음
    static void printMultiply(MyFunction f) {
        System.out.println(f.calc(3, 4));
    }

}
