package example.ex05.generic.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {

//        String[] sArr = {"a", "b", "c"};
//        List<String> sList = Arrays.asList(sArr);
//        Stream<String> sStream = sList.stream(); // sList 를 소스로 하는 컬렉션 생성
//        sStream.forEach(System.out::println);
//        System.out.println();
//
//        Integer[] iArr= {1,4,5,6,7};
//        List<Integer> list1 = Arrays.asList(iArr);
//        Stream<Integer> intStream1 = Arrays.stream(iArr);
//        intStream1.sorted().forEach(System.out::println);
//        System.out.println();
//
//        List list2 = Arrays.asList(new Integer[]{1,2,3,4,5});
//        Stream<Integer> intStream2 = list2.stream();
//        intStream2.sorted().forEach(System.out::println);

        Stream<String> s1 = Stream.of("a","b","c");
        Stream<String> s2 = Stream.of(new String[]{"a", "b", "c"});

        IntStream s3 = IntStream.of(1,2,3,4);
        IntStream s4 = IntStream.range(1, 5);
    }
}
