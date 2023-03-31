package tijava.ch09;

public class AStaticBEx {
    public static void main(String[] args) {
        AStaticB.B b = new AStaticB.B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(A.B.field2);
        b.method2();
    }
}
