package doit.ch11.stringtest;

public class StringTest2 {
    public static void main(String[] args) {
        String javaStr = new String("java");
        String javaStr2 = new String("spring");
        System.out.println(javaStr);
        System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javaStr));

        // 문자열은 불변하므로 javaStr 값 자체가 변하는 것이 아닌, 새로운 문자열이 생성된 것
        System.out.println();
        javaStr = javaStr.concat(javaStr2);
        System.out.println(javaStr);
        System.out.println("연결된 문자열 주소 값 : " + System.identityHashCode(javaStr));

        System.out.println();
        System.out.println(System.identityHashCode(javaStr2));
        javaStr2 = "test";
        System.out.println(System.identityHashCode(javaStr2));
    }
}
