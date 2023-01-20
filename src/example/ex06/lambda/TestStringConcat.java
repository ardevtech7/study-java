package example.ex06.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        StringConcatImpl concat = new StringConcatImpl();
        concat.makeString(s1,s2);

        StringConcat concat1 = (s,v) -> System.out.println(s + "," + v);
        concat.makeString(s1, s2);
    }
}
