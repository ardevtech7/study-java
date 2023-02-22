package example.ex06.lambda.ex03;

public class MyFunctionTest3 {
    public static void main(String[] args) {
        MyFunction3<String> f1 = x -> System.out.println(x.toString());
        f1.print("ABC"); // String 객체를 람다식에 넘겨준다.

        MyFunction3<Integer> f2 = x -> System.out.println(x.toString());
        f2.print(Integer.valueOf(100));
    }
}
