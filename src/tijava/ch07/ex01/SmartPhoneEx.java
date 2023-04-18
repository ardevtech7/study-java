package tijava.ch07.ex01;

public class SmartPhoneEx {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Apple", "흰색");

        // phone 으로부터 상속받은 필드 읽기
        System.out.println("모델 : " + smartPhone.model);
        System.out.println("색상 : " + smartPhone.color);

        // smartPhone 필드 읽기
        System.out.println("와이파이 상태 : " + smartPhone.wifi);

        // phone 으로부터 상속받은 메소드 호출
        smartPhone.bell();
        smartPhone.sendVoice("hello");
        smartPhone.receiveVoice("hello 2");
        smartPhone.hangUp();

        smartPhone.setWifi(true);
        smartPhone.internet();
    }
}
