package doit.ch08.v1;

// 일반 고객
// 등급 - SILVER
// 구매 가격에 따른 보너스 포인트 = 0.01 (1%)
public class Customer {
    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;

    // 디폴트 생성자
    // 기본 등급 및 적립 비율
    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    // 보너스 포인트 적립 및 지불 가격 계산해서 리턴
    // 할인되지 않는 경우 가격을 그대로 반환
    // 가격에 대해 보너스 포인트 비율을 적용하여 보너스 포인트를 적립
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price; // 지불가격
    }

    // [출력 1] 리턴한 String 값을 받아서 출력하던지, println 매개변수에 넣어서 출력
    public String showCustomerInfo() {
        return customerName + " 님의 등급 : " + customerGrade + ", 보너스 포인트 : " + bonusPoint;
    }

    // [출력 2] 바로 출력
    public void showInfo() {
        System.out.println(customerName + " 님의 등급 : " + customerGrade + ", 보너스 포인트 : " + bonusPoint);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.customerName = "홍길동";
        customer.customerID = 1;
        customer.calcPrice(1000);

        System.out.println(customer.showCustomerInfo());
    }
}
