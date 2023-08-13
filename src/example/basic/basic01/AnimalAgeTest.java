package example.basic.basic01;

public class AnimalAgeTest {
    public static void main(String[] args) {
        Age age = new Age(10);
        Animal animal = new Animal(age);
        System.out.println(animal.getAge().getValue()); // 10

//        animal.getAge().setValue(20);
        System.out.println(animal.getAge().getValue()); // 20
    }
}
