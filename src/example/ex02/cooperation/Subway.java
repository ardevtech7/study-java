package example.ex02.cooperation;

public class Subway {
    String lineNumber;
    int passengerCount;
    int money;
    public Subway(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("lineNumber" + lineNumber + " 의 승객 수는 " + passengerCount + "명 이고, " +
                "수입은 " + money + "원");
    }
}
