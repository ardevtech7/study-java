package example.ex06.stream.ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("김자바");
        set.add("이자바");
        set.add("박자바");

        Stream<String> stream = set.stream();
        stream.forEach(System.out::println);

        System.out.println();

        List<String> list = new ArrayList<>();
        list.add("김자바");
        list.add("이자바");
        list.add("박자바");
        list.add("신자바");
        list.add("람다식");

        // 병렬 처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(name -> {
            System.out.println(name + ": " + Thread.currentThread().getName());
        });

    }
}
