package example.ex06.lambda.ex08.ex05;

public class LambdaEx {
    public static void main(String[] args) {
        Person person = new Person();
        person.action(LambdaEx::sum);
        person.action((x, y) -> x - y);

    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}
