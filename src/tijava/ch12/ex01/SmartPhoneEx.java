package tijava.ch12.ex01;

public class SmartPhoneEx {
    public static void main(String[] args) {
        SmartPhone smartPhone1 = new SmartPhone("삼성", "안드로이드");
        String result = smartPhone1.toString();

        System.out.println(result);
        System.out.println(smartPhone1); // toString() 호출
    }
}
