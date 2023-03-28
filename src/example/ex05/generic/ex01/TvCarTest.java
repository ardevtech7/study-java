package example.ex05.generic.ex01;

public class TvCarTest {
    public static void main(String[] args) {
        Product<String, TV> product = new Product<>();
        product.setKind("스마트 TV");
        product.setModel(new TV());

        String kind = product.getKind();
        TV model = product.getModel();

        //

        Product<String, Car> product1 = new Product<>();
        product1.setKind("스마트 Car");
        product1.setModel(new Car());

        String kind1 = product1.getKind();
        Car model1 = product1.getModel();
    }
}
