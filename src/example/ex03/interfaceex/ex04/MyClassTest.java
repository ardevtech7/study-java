package example.ex03.interfaceex.ex04;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // 상위 인터페이스에 대입하면, 상위 인터페이스에 선언한 메서드만 호출 가능
        X xClass = myClass;
        xClass.x();

        Y yClass = myClass;
        yClass.y();

        // 구현한 인터페이스형 변수에 대입하면 인터페이스가 상속한 모든 메서드 호출 가능
        MyInterface myInterface = myClass;
        myInterface.x();
        myInterface.y();
        myInterface.myMethod();
    }
}
