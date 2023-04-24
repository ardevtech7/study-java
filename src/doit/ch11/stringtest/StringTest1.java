package doit.ch11.stringtest;

// String 선언 방식
public class StringTest1 {
    public static void main(String[] args) {
        // (1) 생성자의 매개변수로 문자열 생성
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        // (2) 문자열 상수를 가리키는 방식 - 문자열 상수의 메모리 주소를 가리킴
        String str3 = "test";
        String str4 = "test";
        System.out.println();
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
