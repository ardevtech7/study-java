package tijava.ch07.ex06;

// 추상클래스
public abstract class Phone {
    String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("On");
    }

    void turnOff() {
        System.out.println("Off");
    }
}
