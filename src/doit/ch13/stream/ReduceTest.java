package doit.ch13.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    // reduce() 메서드가 호출될 때 불리는 메서드. 두 문자열 길이 비교
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) {
            return s1;
        } else {
            return s2;
        }
    }
}
public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~", "hello"};

        // (1) 람다식을 직접 구현하는 방법
        System.out.println(Arrays.stream(greetings).reduce("" ,
                (s1, s2) -> {
                        if (s1.getBytes().length >= s2.getBytes().length) {
                            return s1;
                        } else {
                            return s2;
                        }})
        );

        // (2) BinaryOperator 를 구현한 클래스를 사용
        String str = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str);
    }
}
