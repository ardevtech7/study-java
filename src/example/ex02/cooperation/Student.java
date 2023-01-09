package example.ex02.cooperation;

public class Student {
    public String studentName;
    public int grade;
    public int money;

    // 생성자
    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    /*
        버스를 탄다.
        학생이 버스를 타면 1000원 지불하는 기능을 구현한 메서드
     */
    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    // 지하철을 탄다
    public void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500;
    }

    // 학생의 현재 정보를 보여 준다.
    public void showInfo() {
        System.out.println("studentName " + studentName + " 의 남은 돈은 " + money);
    }
}
