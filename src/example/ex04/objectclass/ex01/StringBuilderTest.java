package example.ex04.objectclass.ex01;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s1 = new String("java");
        System.out.println("s1 문자열 주소: " + System.identityHashCode(s1));

        StringBuilder buffer = new StringBuilder(s1);
        System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" python");
        System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));

        s1 = buffer.toString();
        System.out.println(s1);
        System.out.println("새로 만들어진 s1 문자열 주소: " + System.identityHashCode(s1));
    }
}
