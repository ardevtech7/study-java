package tijava.ch07.ex04;

public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 매개값으로 Bus 객체를 제공하고, driver() 메소드 호출
        Bus bus = new Bus();
        driver.drive(bus); // driver.drive(new Bus()) 동일

        driver.drive(new Taxi());
    }
}
