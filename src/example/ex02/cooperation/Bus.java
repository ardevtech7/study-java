package example.ex02.cooperation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money; // 버스 수압
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("busNumber " + busNumber + " 의 승객은" + passengerCount + " 명, " +
                "수입은 " + money + "원");
    }
}
