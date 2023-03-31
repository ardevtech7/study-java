package tijava.ch12.ex03;

/*
    Wrapper 객체
    - 기본 타입을 객체로 생성 (값 변경 x)
    - 사용하는 이유
        - 컬렉션 객체를 사용할 때, 기본 타입 저장이 불가능하고 오로지 객체만 저장 가능하기 때문이다.
 */
public class BoxingUnBoxingEx {
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;
        System.out.println(obj.intValue()); // Integer 객체 내부의 int 값을 리턴

        // UnBoxing
        int value = obj;
        System.out.println(value);

        // 연산 시 UnBoxing
        int result = obj + 100;
        System.out.println(result);

        // 문자열 -> 기본 타입
        String str1 = "7777";
        int strToIntValue = Integer.parseInt(str1);
        System.out.println(strToIntValue);

        String str2 = "3.14";
        double strToDouble = Double.parseDouble(str2);
        System.out.println(strToDouble);
    }
}
