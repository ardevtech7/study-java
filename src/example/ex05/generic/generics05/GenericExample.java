package example.ex05.generic.generics05;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv("Tv"));
        product1.setModel("Smart Tv");

        Tv tvKind = product1.getKind();
        String tvModel = product1.getModel();
        System.out.println(tvKind.toString() + ", " + tvModel);

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car("Car"));
        product2.setModel("SUV Car");

        Car carKind = product2.getKind();
        String carModel = product2.getModel();
        System.out.println(carKind.toString() + ", " + carModel);
    }
}
