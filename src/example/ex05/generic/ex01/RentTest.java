package example.ex05.generic.ex01;

public class RentTest {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home rent = homeAgency.rent();
        rent.turnOnLight();

        CarAgency carAgency = new CarAgency();
        RentCar rent1 = carAgency.rent();
        rent1.run();
    }
}
