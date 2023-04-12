package doit.ch06;

public class Subway {
    public int subwayNumber;
    public int passengerCount;
    public int money;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    public void takeSubway(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showInfo() {
        System.out.println(subwayNumber + "번 지하철의 승객 : " + passengerCount + "명이고, " + "수입 : " + money);
    }
}
