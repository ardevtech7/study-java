package doit.ch08.v1;

// VIP 고객
// 등급 - VIP
// 구매 가격에 따른 보너스 포인트 = 0.05 (5%)
// 제품 구입 시 할인율 = 0.1 (10%)
// 담당 상담원 배정
public class VIPCustomer {
    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;

    // vip 고객 관련 기능을 구현할 때만 필요한 멤버 변수
    private int agentID; // 상담원 아이디
    double saleRatio; // 할인율

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05; // 보너스 적립 5%
        saleRatio = 0.1; // 할인율 10%
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price -  (int)(price * saleRatio); // 지불가격
    }

    public int getAgentID() {
        return agentID;
    }

    public String showVIPCustomerInfo() {
        return customerName + " 님의 등급 : " + customerGrade + ", 보너스 포인트 : " + bonusPoint;
    }
}
