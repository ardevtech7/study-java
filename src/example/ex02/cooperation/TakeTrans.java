package example.ex02.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student student1 = new Student("ahram", 10000);
        Bus bus = new Bus(3100);
        Subway subway = new Subway("7");
        student1.takeBus(bus);
        student1.takeSubway(subway);

        Student student2 = new Student("bonggi", 20000);
        Bus bus1 = new Bus(3200);
        Subway subway1 = new Subway("4");
        student2.takeBus(bus1);
        student2.takeSubway(subway1);

        Student student3 = new Student("heni", 30000);
        student3.takeBus(bus);

        bus.showInfo();
        subway.showInfo();
    }
}
