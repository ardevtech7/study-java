package doit.ch08.v2;

// VIP 고객
// 등급 - VIP
// 구매 가격에 따른 보너스 포인트 = 0.05 (5%)
// 제품 구입 시 할인율 = 0.1 (10%)
// 담당 상담원 배정
public class VIPCustomer extends Customer {
    // vip 고객 관련 기능을 구현할 때만 필요한 멤버 변수
    private int agentID; // 상담원 아이디
    double saleRatio; // 할인율

//    public VIPCustomer() {
//        // super() 컴파일러가 자동으로 생성
//        customerGrade = "VIP";
//        bonusRatio = 0.05; // 보너스 적립 5%
//        saleRatio = 0.1; // 할인율 10%
//        System.out.println("VIPCustomer 생성자 호출");
//    }

    // 상위 클래스에 디폴트 생성자가 없을 경우 에러, super() 에 매개변수 추가해서 직접 호출
    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05; // 보너스 적립 5%
        saleRatio = 0.1; // 할인율 10%
        this.agentID = agentID;
//        System.out.println("(2) VIPCustomer 생성자 호출");
    }

    // 메소드 오버라이딩
    // 반환형, 메소드 이름, 매개변수 개수, 매개변수 반환형 모두 동일
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price -  (int)(price * saleRatio); // 지불가격
    }

    public int getAgentID() {
        return agentID;
    }

    public String showVIPInfo() {
        return super.showCustomerInfo() + ", 상담원 아이디 : " + agentID;
    }

}
