package example.ex03.interfaceex.ex01;

/**
 * 인터페이스에 있는 메소드 중 일부만 구현했기 때문에 추상 클래스로 구현된다.
 */
public abstract class Calculator implements Calc{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
