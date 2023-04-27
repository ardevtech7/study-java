package doit.ch13.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        // 클래스에서 인터페이스 구현
        String s1 = "hello";
        String s2 = "world";
        StringConcatImpl concat1 = new StringConcatImpl();
        concat1.makeString(s1, s2);

        // 람다식에서 인터페이스 구현
        StringConcat concat2 = (s, v) -> System.out.println(s + " , " + v);
        concat2.makeString(s1, s2);
    }
}
