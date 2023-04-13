package doit.ch08.v2;

public class OverridingTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(1, "홍길동");
//        customerLee.bonusPoint = 1000;


        Customer customerKim = new VIPCustomer(2, "이순신", 1);
//        customerKim.bonusPoint = 10000;

        int price = 1000;

        System.out.println(customerLee.getCustomerName() + " 님의 지불 금액 : " + customerLee.calcPrice(price));
        System.out.println(customerKim.getCustomerName() + " 님의 지불 금액 : " + customerKim.calcPrice(price));
    }
}
