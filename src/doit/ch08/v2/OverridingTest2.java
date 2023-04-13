package doit.ch08.v2;

public class OverridingTest2 {
    public static void main(String[] args) {
        int price = 1000;

        Customer customerLee = new Customer(1, "이순신");
        System.out.println(customerLee.getCustomerName() + " 님의 지불 금액 : " + customerLee.calcPrice(price));

        VIPCustomer customerHong = new VIPCustomer(1,"홍길동", 1);
        System.out.println(customerHong.getCustomerName() + " 님의 지불 금액 : " + customerHong.calcPrice(price));

        Customer customerKim = new VIPCustomer(2, "김유신", 2);
        System.out.println(customerKim.getCustomerName() + " 님의 지불 금액 : " + customerKim.calcPrice(price));
    }
}
