package doit.ch13.lambda;

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber max = (x, y) -> (x >= y) ? x : y; // 람다식을 인터페이스형 max 형 변수에 대입
        System.out.println(max.getMax(10, 20));
    }
}
