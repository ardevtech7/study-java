package tijava.ch07.ex02;

public class SupersonicAirportEx {
    public static void main(String[] args) {
//        SupersonicAirport supersonicAirport = new SupersonicAirport();
//        supersonicAirport.fly();
//        supersonicAirport.flyMode = SupersonicAirport.SUPERSONIC;
//        supersonicAirport.fly();

        // 타입 변환
        Airplane airplane = new SupersonicAirport();
        airplane.fly();
    }
}
