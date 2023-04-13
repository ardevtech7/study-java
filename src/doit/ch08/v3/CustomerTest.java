package doit.ch08.v3;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(1, "이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        // Customer 자료형의 멤버 변수와 메서드만 접근 가능
        Customer customerKim = new VIPCustomer(1, "김유신", 1);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        System.out.println("\n[할인율과 보너스 포인트 계산]");
        int price = 10000;
        int leePrice = customerLee.calcPrice(price);
        int kimPrice = customerKim.calcPrice(price);

        System.out.println(customerLee.getCustomerName() + " 님의 지불 금액 : " + leePrice);
        System.out.println(customerLee.showCustomerInfo());

        System.out.println(customerKim.getCustomerName() + " 님의 지불 금액 : " + kimPrice);
        System.out.println(customerKim.showCustomerInfo());

    }
}
