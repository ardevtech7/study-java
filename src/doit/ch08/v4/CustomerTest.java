package doit.ch08.v4;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerLee = new Customer(1, "이순신");
        Customer customerKim = new VIPCustomer(1, "김유신", 1);
        Customer customerHong = new GoldCustomer(1,"홍길동");

        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("[ 고객 정보 출력 ]");
        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("\n[ 할인율과 보너스 포인트 계산 ]");
        int price = 10000;
        for (Customer customer: customerList) {
            System.out.println(
                    customer.getCustomerName() + " 님의 지불 금액 : " + customer.calcPrice(price) +
                    " , 보너스 포인트 : " + customer.bonusPoint);
        }
    }
}
