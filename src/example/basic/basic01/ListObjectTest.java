package example.basic.basic01;

import java.util.ArrayList;
import java.util.List;

public class ListObjectTest {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(new Age(1)));

        ListObject listObject = new ListObject(animals);
        for (Animal animal : listObject.getAnimals()) {
            System.out.println(animal.getAge().getValue());
        }

        // List 인 animals 에는 추가되지만, listObject 의 list 에는 추가 안됨
        animals.add(new Animal(new Age(20)));
        for (Animal animal : listObject.getAnimals()) {
            System.out.println(animal.getAge().getValue());
        }
    }
}
