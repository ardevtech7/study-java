package example.ex06.lambda.ex08.ex05;

public class Person {
    public void action(Calculable calculable) {
        double result = calculable.calc(10, 4);
        System.out.println("result: " + result);
    }
}
