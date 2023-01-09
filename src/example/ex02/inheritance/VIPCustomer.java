package example.ex02.inheritance;

public class VIPCustomer extends Customer{
//    private int customerID;
//    private String customerName;
//    private String customerGrade;
//    int bonusPoint; // 고객의 보너스 포인트 -> 고객이 제품을 구매할 경우 누적되는 보너스 포인트
//    double bonusRatio; // 적립 비율

    private int agentID; // VIP 고객 담당 상담원 아이디
    double saleRatio; // 할인율

//    public VIPCustomer() {
//        // super(); 컴파일러가 자동으로 추가하는 코드. 상위 클래스의 Customer() 호출
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//        System.out.println("VIPCustomer() 호출");
//    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 호출");
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio); // 할인율 적용
    }

    // vip 고객에게만 필요한 메서드
    public int getAgentID() {
        return agentID;
    }

    public String showCustomerInfo() {
//        return customerName + " 님의 등급은 " + customerGrade + " 이고, 보너스 포인트는 " + bonusPoint;
        return super.showCustomerInfo() + ", 담당 상담원 ID는 " + agentID;
    }
}
