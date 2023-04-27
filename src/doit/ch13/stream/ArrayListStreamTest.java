package doit.ch13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("banana");
        sList.add("apple");
        sList.add("strawberry");

        Stream<String> stream = sList.stream(); // 스트림 생성
        stream.forEach(s -> System.out.print(s + " ")); // 배열 요소를 하나씩 출력
        System.out.println();

        // 정렬
        sList.stream().sorted().forEach(s -> System.out.print(s + " "));
    }
}
