package example.ex06.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        // 추상 메서드로 구현
        StringConcatImpl concat = new StringConcatImpl();
        concat.makeString(s1,s2);

        // 람다식 인터페이스로 구현
        StringConcat concat1 = (s,v) -> System.out.println(s + "," + v);
        concat1.makeString(s1, s2);
    }
}
