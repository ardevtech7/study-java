package tijava.ch09;

public class A {
    // 인스턴스 멤버 클래스
    class B {
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

    // 인스턴스 메소드
    void useB() {
        // B 객체 생성 및 인스턴스 필드 및 메소드 사용
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        b.method2();
    }
}
