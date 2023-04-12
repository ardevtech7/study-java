package doit.ch06;

public class TakeTrans {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 5000);
        Bus bus = new Bus(1);
        student.takeBus(bus);
        student.showInfo();
        bus.showInfo();

        System.out.println();
        Student student1 = new Student("이순신", 4000);
        Subway subway = new Subway(2);
        student.takeSubway(subway);
        student1.showInfo();
        subway.showInfo();
    }
}
