package doit.ch11.equalhash;

// String, Integer 는 이미 내부에 equals() 메서드가 재정의되어 있다.
public class StringEquals {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); // 주소값 비교
        System.out.println(str1.equals(str2)); // 인스턴스 문자열 값이 같은지 비교
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println();

        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(10);
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));
    }
}
