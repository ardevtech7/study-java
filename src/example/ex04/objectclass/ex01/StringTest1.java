package example.ex04.objectclass.ex01;

public class StringTest1 {
    public static void main(String[] args) {
        String s1 = new String("SimpleTest");
        String s2 = new String("SimpleTest");

        System.out.println(s1 == s2); // 인스턴스가 매번 새로 생성되므로 주소 값이 다르다.
        System.out.println(s1.equals(s2)); // 문자열 값이 같으므로 true 반환

        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4); // 문자열 abc 가 상수풀에 저장되어 있으므로 가리키는 주소값이 같다.
        System.out.println(s3.equals(s4));
    }
}
