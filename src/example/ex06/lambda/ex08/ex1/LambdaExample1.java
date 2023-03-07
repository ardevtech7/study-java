package example.ex06.lambda.ex08.ex1;

public class LambdaExample1 {
    public static void main(String[] args) {
        // Example 1
        Calculable add = (x, y) -> System.out.println(x + y);
        add.calculate(10, 20);

        // Example 2
        action((x, y) -> {
            int result = x + y;
            System.out.println("result : " + result);
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println("result : " + result);
        });
    }

    public static void action(Calculable calculable) {
        // 데이터
        int x = 10;
        int y = 20;

        // 데이터 처리
        calculable.calculate(x, y);
    }
}
