package example.ex02.inheritance;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customerLee = new Customer(10010, "이순신");
//        customerLee.bonusPoint = 1000;

//        VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 1);
//        Customer customerKim = new VIPCustomer(10020, "김유신", 1);
//        customerKim.bonusPoint = 10000;
//
//        int price = 10000;
//        int leePrice = customerLee.calPrice(price);
//        int kimPrice = customerKim.calPrice(price);

//        System.out.println(customerLee.showCustomerInfo() + " , 지불 금액 : " + leePrice);
//        System.out.println(customerKim.showCustomerInfo() + " , 지불 금액 : " + kimPrice);

//        System.out.println(customerLee.getCustomerName() + "의 지불 금액 : " + customerLee.calPrice(price));
//        System.out.println(customerKim.getCustomerName() + "의 지불 금액 : " + customerKim.calPrice(price));

        ArrayList<Customer> customerList = new ArrayList<Customer>();
        Customer cus1 = new Customer(1, "가");
        Customer cus2 = new GoldCustomer(2, "나");
        Customer cus3 = new VIPCustomer(3, "다", 1);
        customerList.add(cus1);
        customerList.add(cus2);
        customerList.add(cus3);

        System.out.println("=== 고객 정보 출력 ===");
        for (Customer cus : customerList) {
            System.out.println(cus.showCustomerInfo());
        }

        System.out.println("=== 할인율과 보너스 포인트 계산 ===");
        int price = 1000;
        for (Customer cus : customerList)  {
            int cusPrice = cus.calPrice(price);
            System.out.println(cus.getCustomerName() + " 고객의 할인율은 " + cus.bonusPoint);
            System.out.println(cus.getCustomerName() + " 고객이 지불할 금액은 " + cusPrice);
        }
    }
}
