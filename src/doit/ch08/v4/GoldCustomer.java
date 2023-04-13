package doit.ch08.v4;

// GOLD 고객
// 등급 - GOLD
// 구매 가격에 따른 보너스 포인트 = 0.02 (2%)
// 제품 구입 시 할인율 = 0.1 (10%)
public class GoldCustomer extends Customer {
    double saleRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }
}
