package example.ex06.stream.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectEx {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", "남",10),
                new Student("김자바", "남",20),
                new Student("박자바", "여",30),
                new Student("박자바", "여",30)
        );

        // 남학생만 묶어 List 생성
        List<Student> studentList = list.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        studentList
                .forEach(System.out::println);
        System.out.println();

        // 학생 이름을 key, 점수를 value 로 갖는 Map 생성
        Map<String, Integer> map = list.stream()
                .distinct()
                .collect(
                        Collectors.toMap(
                                Student::getName,
                                Student::getScore
                        )
                );
        System.out.println(map);
        System.out.println();

        // 요소 그룹핑
        Map<String, List<Student>> map1 = list.stream()
                .distinct()
                .collect(
                        Collectors.groupingBy(Student::getSex)
                );
        System.out.println(map1);
        System.out.println();

        List<Student> maleList = map1.get("남");
        maleList.stream()
                .forEach(System.out::println);
        System.out.println();

        List<Student> femaleList = map1.get("여");
        femaleList.stream()
                .forEach(System.out::println);

    }
}
