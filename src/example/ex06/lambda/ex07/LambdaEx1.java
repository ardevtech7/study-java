package example.ex06.lambda.ex07;

@FunctionalInterface
interface MyFunction {
    void run();
}

public class LambdaEx1 {

    // 매개변수 타입이 Myfunction 인 메서드
    static void execute(MyFunction f) {
        f.run();
    }

    // 반환타입이 Myfunction 인 메서드
    static MyFunction getMyfunction() {
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        // 람다식으로 Myfunction 의 run() 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyfunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));

    }
}
