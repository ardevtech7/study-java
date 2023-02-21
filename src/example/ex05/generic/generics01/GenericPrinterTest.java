package example.ex05.generic.generics01;

public class GenericPrinterTest {
    public static void main(String[] args) {
        // GenericPrinter 객체를 각각 다른 타입을 선언
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        powderPrinter.printing();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        plasticPrinter.printing();
    }
}
