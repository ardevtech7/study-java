package example.ex03.interfaceex.ex01;

public class CalculatorTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        CompleteCalc completeCalc = new CompleteCalc();
        System.out.println(completeCalc.add(a,b));
        System.out.println(completeCalc.sub(a,b));
        System.out.println(completeCalc.divide(a,b));
        System.out.println(completeCalc.times(a,b));

        completeCalc.showInfo();
        completeCalc.description();

        // 인터페이스 이름으로 직접 참조하여 정적 메서드 호출
        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));

    }

}
