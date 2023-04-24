package doit.ch11.stringtest;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str1 = new String("java");
        System.out.println("str1 문자열 주소 : " + System.identityHashCode(str1)); // 인스턴스가 처음 생성됬을 때, 메모리 주소

        StringBuilder buffer = new StringBuilder(str1); // String 으로부터 StringBuilder 생성
        System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));

        buffer.append(" and ");
        buffer.append("spring ");
        // append() 메서드가 실행될 때마다 메모리가 새로 생성되는 것이 아니라, 하나의 메모리에 계속 연결되는 것을 해시 코드 값을 통해 알 수 있다.
        System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));

        str1 = buffer.toString();
        System.out.println(str1);
        System.out.println("새로 만들어진 str1 문자열 주소 : " + System.identityHashCode(str1));
    }
}
