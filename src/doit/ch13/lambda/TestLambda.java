package doit.ch13.lambda;

interface PrintString {
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {
        // (1) 람다식을 인터페이스 형 변수에 대입하고, 그 변수를 사용해서 람다식 구현부 호출
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("hello lambda 1");

        // (2)
        showMyString(lambdaStr);

        // (3)
        PrintString reString = returnString();
        reString.showString("hello");
    }

    // 매개변수로 전달하는 람다식
    public static void showMyString(PrintString p) {
        p.showString("hello lambda 2");
    }

    // 반환 값으로 쓰이는 람다식
    public static PrintString returnString() {
        return s -> System.out.println(s + "world");
    }
}
