package tijava.ch12.ex03;

/*
    Wrapper 객체는 ==, != 비교 불가
    단, 예외적으로 아래 타입들의 값의 범위는 가능
    boolean : true, false
    char
    byte, short, int : -128 ~ 127
 */
public class ValueCompareEx {
    public static void main(String[] args) {
        // -128 ~ 127 초과
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        System.out.println();

        // -128 ~ 127 범위
        Integer obj3 = 300;
        Integer obj4 = 300;
        System.out.println(obj3 == obj4);
        System.out.println(obj3.equals(obj4));

    }
}
