package example.ex06.stream.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("김자바", 20),
                new Student("박자바", 30),
                new Student("박자바", 30),
                new Student("서자바", 50)
        );

        // Optional 1
        OptionalDouble optional = list.stream()
                .distinct()
                .mapToInt(Student::getScore)
                .average();
        if (optional.isPresent()) {
            System.out.println("평균 --> " + optional.getAsDouble());
        } else {
            System.out.println("평균 --> 0.0");
        }

        // Optional 2
        double avg = list.stream()
                .distinct()
                .mapToInt(Student::getScore)
                .average()
                .orElse(0.0);
        System.out.println("평균: " + avg);

        // Optional 3
        list.stream()
                .distinct()
                .mapToDouble(Student::getScore)
                .average()
                .ifPresent(a -> System.out.println("평균: " + a));
    }
}
