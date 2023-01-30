package example.ex06.lambda;

public class MyFunctionTest3 {
    public static void main(String[] args) {

        // 람다식을 매개변수로 전달하기
        MyFunction f = ((x, y) -> x * y);
        printMultiply(3,4,f);
    }

    // f 로 (x,y) -> x * y 람다식 전달받음
    static void printMultiply(int x, int y, MyFunction f) {
        System.out.println(f.calc(x,y));
    }

}
