package tijava.ch09;

public class AStaticB {
    // 정적 멤버 클래스
    // default : 같은 패키지에서 사용 가능
    static class B {
        // 인스턴스 필드
        int field1 = 1;

        // 정적 필드 (자바17 부터 가능)
        static int field2 = 2;

        B() {
            System.out.println("B 생성자 실행");
        }

        // 인스턴스 메소드
        void method1() {
            System.out.println("B method1 실행");
        }

        void method2() {
            System.out.println("B method1 실행");
        }
    }

    // 인스턴스 필드 값으로 B 객체 대입
    B field1 = new B();

    // 정적 필드 값으로 B 객체 대입
    static B field2 = new B();

    public AStaticB() {
        B b = new B();
    }

    void method1() {
        B b = new B();
    }

    static void method2() {
        B b = new B();
    }
}
