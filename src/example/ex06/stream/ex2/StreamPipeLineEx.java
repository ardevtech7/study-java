package example.ex06.stream.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx {
    public static void main(String[] args) {
        // Example 1 - 컬렉션으로부터 스트림 얻기
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("김자바", 20),
                new Student("박자바", 30)
        );

        double avg = list.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println(avg);
        System.out.println();

        // Example 2
        List<Student> list1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Student student = new Student("테스트 " + i, i);
            list1.add(student);
        }

        Stream<Student> stream = list1.stream();
        stream.forEach(System.out::println);
        System.out.println();

        // Example 3 - 배열로부터 스트림 얻기
        String[] strArr = {"홍길동", "김자바", "이자바"};
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach(System.out::println);
        System.out.println();

        int[] intArr = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach(s -> System.out.print(s + ", "));
        System.out.println();

        // Example 4 - Comparable 구현 객체의 정렬
        List<Student> compareList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("김자바", 20),
                new Student("박자바", 30)
        );

        // 점수를 기준으로 오름차순 정렬
        compareList.stream()
                .sorted()
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
        System.out.println();

        // 점수를 기준으로 내림차순 정렬
        compareList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}
