package example.ex06.stream.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("홍길동");
        sList.add("강감찬");
        sList.add("이순신");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s + " "));
        System.out.println();

        sList.stream().sorted().forEach(s-> System.out.println(s));
    }
}
