package doit.ch06;

public class Student {
    public String studentName;
    public int grade;
    public int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    // 버스를 탄다
    // 요금을 내면, money--
    public void takeBus(Bus bus) {
        bus.takeBus(1000);
        this.money -= 1000;

    }

    // 지하철을 탄다.
    public void takeSubway(Subway subway) {
        subway.takeSubway(1500);
        this.money -= 1500;
    }

    // 힉생의 현재 정보를 보여준다.
    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈 : " + money);
    }
}
