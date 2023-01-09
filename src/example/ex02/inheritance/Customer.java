package example.ex02.inheritance;

public class Customer {
    /*
        protected 예약어가 붙은 변수는 상속받은 하위 클래스에서는 public 처럼 사용 가능.
        그외 클래스에서는 private 처럼 사용되므로 get, set 메서드로 접근해야
     */

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint; // 고객의 보너스 포인트 -> 고객이 제품을 구매할 경우 누적되는 보너스 포인트
    double bonusRatio; // 적립 비율

//    public Customer() {
//        customerGrade = "SILVER";
//        bonusRatio = 0.01; // 보너스 포인트 기본 적립 비율
//        System.out.println("Customer() 호출");
//    }

//    public Customer(int customerID, String customerName) {
//        this.customerID = customerID;
//        this.customerName = customerName;
//        customerGrade = "SILVER";
//        bonusRatio = 0.01; // 보너스 포인트 기본 적립 비율
//        System.out.println("Customer() 호출");
//    }

    public Customer() {
        initCustomer();
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        initCustomer();
    }
    // 생성자에서만 호출되는 메서드니까 private로 선언
    private void initCustomer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + " 고객님의 등급은 " + customerGrade + " 이고, 보너스 포인트는 " + bonusPoint;
    }

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
}
