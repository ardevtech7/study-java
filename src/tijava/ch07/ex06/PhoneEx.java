package tijava.ch07.ex06;

public class PhoneEx {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성 불가
//        Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
