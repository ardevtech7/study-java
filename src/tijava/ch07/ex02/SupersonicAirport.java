package tijava.ch07.ex02;

public class SupersonicAirport extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    public int flyMode =  SUPERSONIC;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행");
        } else {
            // Airplane 객체의 fly() 메소드 호출
            super.fly();
        }
    }
}
