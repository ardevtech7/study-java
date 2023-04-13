package doit.ch08.v2;

// 일반 고객
// 등급 - SILVER
// 구매 가격에 따른 보너스 포인트 = 0.01 (1%)
public class Customer {
    // protected : 상위 클래스에서 작성한 변수나 메서드에 외부 클래스에서 사용할 수 없지만 하위 클래스에서는 사용할 수 있도록 지정하는 예약어
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    // 디폴트 생성자
    // 기본 등급 및 적립 비율
//    public Customer() {
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//        System.out.println("Customer 생성자 호출");
//    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
//        System.out.println("(1) Customer 생성자 호출");
    }

    // 보너스 포인트 적립 및 지불 가격 계산해서 리턴
    // 할인되지 않는 경우 가격을 그대로 반환
    // 가격에 대해 보너스 포인트 비율을 적용하여 보너스 포인트를 적립
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price; // 지불가격
    }

    // protected 로 선언한 변수를 외부에서 사용할 수 있도록 get, set() 추가
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    // [출력 1] 리턴한 String 값을 받아서 출력하던지, println 매개변수에 넣어서 출력
    public String showCustomerInfo() {
        return customerName + " 님의 등급 : " + customerGrade + ", 보너스 포인트 : " + bonusPoint;
    }

    // [출력 2] 바로 출력
    public void showInfo() {
        System.out.println(customerName + " 님의 등급 : " + customerGrade + ", 보너스 포인트 : " + bonusPoint);
    }
}
