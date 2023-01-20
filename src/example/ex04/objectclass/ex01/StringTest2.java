package example.ex04.objectclass.ex01;

public class StringTest2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("def");

        System.out.println(s1);
        System.out.println("처음 문자열 주소값: " + System.identityHashCode(s1));

        s1 = s1.concat(s2);

        System.out.println(s1);
        System.out.println("연결된 문자열 주소값: " + System.identityHashCode(s1));
    }

}
