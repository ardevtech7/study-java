package doit.ch08.v4;

// VIP 고객
// 등급 - VIP
// 구매 가격에 따른 보너스 포인트 = 0.05 (5%)
// 제품 구입 시 할인율 = 0.1 (10%)
// 담당 상담원 배정
public class VIPCustomer extends Customer {
    private int agentID; // 상담원 아이디
    double saleRatio; // 할인율

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05; // 보너스 적립 5%
        saleRatio = 0.1; // 할인율 10%
        this.agentID = agentID;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price -  (int)(price * saleRatio); // 지불가격
    }

    public int getAgentID() {
        return agentID;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + ", 상담원 아이디 : " + agentID;
    }

}
