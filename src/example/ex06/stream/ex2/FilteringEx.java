package example.ex06.stream.ex2;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {
    public static void main(String[] args) {
        // Example 1
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("김자바", 20),
                new Student("박자바", 30),
                new Student("박자바", 30)
        );

        list.stream()
                .distinct() // equals(), hashCode() 재정의
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .mapToInt(Student::getScore)
                .forEach(System.out::println);
        System.out.println();

        // Example 2
        List<String> list1 = Arrays.asList("홍길동", "김길동", "신길동");
        list1.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(System.out::println);
    }
}
