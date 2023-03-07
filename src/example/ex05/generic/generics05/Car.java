package example.ex05.generic.generics05;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
