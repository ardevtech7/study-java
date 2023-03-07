package example.ex06.stream.ex2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapEx {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

        IntStream intStream = Arrays.stream(intArr);
        intStream
                .asDoubleStream()
                .forEach(System.out::println);
        System.out.println();

        intStream = Arrays.stream(intArr);
        intStream
                .boxed()
                .forEach(System.out::println);
    }
}
