package example.ex05.generic.ex01;

public class CarAgency implements Rentable<RentCar> {
    @Override
    public RentCar rent() {
        return new RentCar();
    }
}
