package example.ex05.generic.stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx02 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"),
                new File("Ex2.bak"),
                new File("Ex3.txt"),
                new File("Ex4")
        };

        // Stream 생성 - 1
        Stream<File> fileStream = Stream.of(fileArr);

        // map 으로 Stream<File> 을 Stream<String> 으로 변환
        Stream<String> fileNameStream = fileStream.map(File::getName);
        fileNameStream.forEach(System.out::println);
        System.out.println();

        // Stream 생성 - 2
        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName) // Stream<File> -> Stream<String>
                /**
                 * indexOf
                 * 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며, 찾지 못했을 경우 -1 반환
                 */
                .filter(s -> s.indexOf('.') != -1) // 확장자가 없는 것은 제외
                .map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출
                .map(String::toUpperCase) // 모두 대문자로 변환
                .distinct() // 중복 제거
                .forEach(System.out::println);
        System.out.println();
    }
}
