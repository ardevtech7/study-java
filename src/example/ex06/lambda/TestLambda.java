package example.ex06.lambda;

public class TestLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("hello");

        showMyString(lambdaStr);

        PrintString reStr = returnString();
        reStr.showString("hello3");
    }
    public static void showMyString(PrintString p) {
        p.showString("hello 2");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + " world");
    }
}
