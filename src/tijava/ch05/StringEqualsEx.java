package tijava.ch05;

public class StringEqualsEx {
    public static void main(String[] args) {
        // String - 1) 동일한 문자 리터럴이면, 동일한 객체 번지 공유
        // strVal1 변수가 참조하고 있는 String 객체 문자열은 "홍길동"
        String strVal1 = "홍길동";
        String strVal2 = "홍길동";

        if (strVal1 == strVal2) {
            System.out.println("동일한 객체 번지 공유");
        } else {
            System.out.println("다른 객체 번지 공유");
        }

        // 동일한 String 객체든 다른 String 객체든 상관없이 비교할 경우 String 객체의 equals() 사용
        if (strVal1.equals(strVal2)) {
            System.out.println("문자열이 같음");
        }

        // String 2 - new 연산자로 생성
        String strVal3 = new String("홍길동");
        String strVal4 = new String("홍길동");

        if (strVal3 == strVal4) {
            System.out.println("동일한 객체 번지 공유");
        } else {
            System.out.println("다른 객체 번지 공유");
        }

        if (strVal3.equals(strVal4)) {
            System.out.println("문자열이 같음");
        }
    }
}
