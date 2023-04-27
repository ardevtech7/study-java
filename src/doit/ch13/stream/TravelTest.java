package doit.ch13.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("=== 고객 명단에 추가된 순서대로 출력 ===");
        // 고객 이름 가져오고, 출력
        customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

        // 각 고객이 지불한 비용을 가져와서 그 값을 정수료 변환 후, sum
        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("=== 총 여행 비용 ===");
        System.out.println("총 여행 비용 : " + total);

        System.out.println("=== 20세 이상 고객 명단 정렬하여 출력 ===");
        customerList.stream().filter(c -> c.getAge() >= 20)
                .map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
    }
}
