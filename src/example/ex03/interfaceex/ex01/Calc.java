package example.ex03.interfaceex.ex01;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999;

    int add(int a, int b);
    int sub(int a, int b);
    int times(int a, int b);
    int divide(int a, int b);

    // 인터페이스 - 디폴트 메서드
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    // 인터페이스 - 정적 메서드
    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        myStaticMethod();
        return total;
    }

    // 인터페이스 - private 메서드
    private void myMethod() {
        System.out.println("private 메서드입니다.");
    }

    private static void myStaticMethod() {
        System.out.println("private static 메서드입니다.");
    }
}
