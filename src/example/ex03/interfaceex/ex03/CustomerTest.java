package example.ex03.interfaceex.ex03;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        /**
         *  Customer 클래스형인 customer 를 Buy 인터페이스형인 buyer 에 대입하여 형 변환.
         *  buyer 는 Buy 인터페이스의 메서드만 호출 가능
         */
        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();

        if (seller instanceof Customer) {
            Customer customer1 = (Customer) seller;
            customer1.buy();
            customer1.sell();
            customer1.order();
        }
    }
}
