package example.ex06.stream.ex03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class concatEx {
    public static void main(String[] args) {
        List<String> number = Arrays.asList("1", "2", "3");
        List<String> chars = Arrays.asList("A", "B", "C");

//        System.out.println(number);
        Stream<String> stream1 = number.stream();
        Stream<String> stream2 = chars.stream();
        Stream<String> concatStream = Stream.concat(stream1, stream2);
//        concatStream.forEach(System.out::println);

        // stream.of : 스트림 객체를 바로 생성할 수 있다.
        Stream<String> streamOf = Stream.of("1", "2");
//        streamOf.forEach(System.out::println);
    }
}
