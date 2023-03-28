package example.ex05.generic.ex01;

public class BoundedTypeTest {
    // Number 타입과 자식 클래스에만 대체 가능한 타입 파라미터 정의
    public static <T extends Number> boolean compare(T t1, T t2) {
        // T의 타입을 출력
        System.out.println(
                "compare(" + t1.getClass().getSimpleName() + " , " + t2.getClass().getSimpleName() + ")");

        // Number 의 메소드 사용
        double v1 = t1.doubleValue(); // Number 타입의 doubleValue() 메소드 호출
        double v2 = t2.doubleValue();

        return (v1 == v2);
    }

    public static void main(String[] args) {
        boolean result1 = compare(123, 123);
        System.out.println(result1);

        boolean result2 = compare(1.5, 1.7);
        System.out.println(result2);
    }
}
