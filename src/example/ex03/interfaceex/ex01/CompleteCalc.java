package example.ex03.interfaceex.ex01;

public class CompleteCalc extends Calculator{
    @Override
    public int times(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        return Calc.ERROR;
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }

    @Override
    public void description() {
        super.description();
        System.out.println("CompleteCalc 클래스에서 디폴트 인터페이스 재정의");
    }
}
