package example.ex06.stream.ex1;

import java.util.Arrays;
import java.util.List;

public class TravleTest {
    public static void main(String[] args) {
//        List<TravelCustomer> customerList = new ArrayList<>();
//        TravelCustomer travleCustomer1 = new TravelCustomer("이순신", 10, 50);
//        TravelCustomer travleCustomer2 = new TravelCustomer("김유신", 20, 100);
//        TravelCustomer travleCustomer3 = new TravelCustomer("홍길동", 30, 100);
//
//        customerList.add(travleCustomer1);
//        customerList.add(travleCustomer2);
//        customerList.add(travleCustomer3);
//
//        System.out.println("=== 고객 명단 출력 ===");
//        customerList.stream().map(c -> c.getNumber()).forEach(s -> System.out.println(s));
//
//        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
//        System.out.println("총 여행 비용: " + total);
//
//        System.out.println("== 20세 이상 고객 명단 정렬 ===");
//        customerList.stream().filter(c -> c.getAge() >= 20)
//                .map(c -> c.getNumber()).sorted().forEach(s -> System.out.println(s));

        // Refactoring
        List<TravleCustomer> customerList1 = Arrays.asList(
                new TravleCustomer("이순신", 10, 50),
                new TravleCustomer("김유신", 20, 100),
                new TravleCustomer("홍길동", 30, 100)
        );
        System.out.println("===== 고객 명단 출력 =====");
        customerList1.stream()
                .map(TravleCustomer::getName)
                .forEach(System.out::println);

        int total = customerList1.stream()
                .mapToInt(TravleCustomer::getPrice).sum();
        System.out.println("총 여행 비용: " + total);

        System.out.println("===== 20세 이상 고객 명단 출력=====");
        customerList1.stream()
                .filter(c -> c.getAge() >= 20)
                .map(TravleCustomer::getName)
                .sorted()
                .forEach(System.out::println);

    }
}
