package example.ex06.stream.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingEx {
    public static void main(String[] args) {
        // 문장 스트림 -> 단어 스트림
        List<String> list = new ArrayList<>();
        list.add("This is java");
        list.add("I am a best developer");

        list.stream()
                // Arrays.stream() 은 주어진 String[] 배열을 Stream<String> 으로 만듦
                .flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(System.out::println);
        System.out.println();

        // 문자열 숫자 목록 -> 숫자 스트림
        List<String> list1 = List.of("10, 20, 30, 40, 50");
        list1.stream()
                .flatMapToInt(data -> {
                    // String[] -> int[]
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                    return Arrays.stream(intArr);
                })
                .forEach(System.out::println);
    }
}
