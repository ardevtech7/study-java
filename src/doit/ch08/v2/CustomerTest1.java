package doit.ch08.v2;

public class CustomerTest1 {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setCustomerName("홍길동");
//        customer.setCustomerID(1);
//        customer.bonusPoint = 1000;
//        customer.showInfo();
//
//        VIPCustomer vipCustomer = new VIPCustomer();
//        vipCustomer.setCustomerName("이순신");
//        vipCustomer.setCustomerID(2);
//        vipCustomer.bonusPoint = 10000;
//        vipCustomer.showInfo();

        VIPCustomer vipCustomer = new VIPCustomer(1, "이순신", 1001);
        System.out.println(vipCustomer.showVIPInfo());

        Customer customer = new VIPCustomer(1, "홍길동", 1002);
    }
}
