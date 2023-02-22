package example.ex06.lambda.ex04;

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber max = Math::max;
        System.out.println(max.getMax(10,20));
    }
}
