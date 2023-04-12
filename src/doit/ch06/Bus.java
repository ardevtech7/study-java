package doit.ch06;

public class Bus {
    // 학생 한 명이 승차하면, 버스 요금 ++ , 승객 수 ++
    public int busNumber;
    public int passengerCount;
    public int money;

    // 승객수와 돈은 학생 객체에 따라서 달라지기 때문에 생성자 초기화 불필요
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    // 버스를 타면, 승객이 돈을 지불(1000원)
    public void takeBus(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(busNumber + "번 버스의 승객 : " + passengerCount + "명이고, " + "수입 : " + money);
    }

}
