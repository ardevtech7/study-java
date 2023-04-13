package doit.ch08.downcasting;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직인다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네 발로 걷습니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eager extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개 펴고 날아갑니다.");
    }
}

public class AnimalTest {
    ArrayList<Animal> animalList = new ArrayList<>();
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.addAnimal();

        System.out.println("\n[ 원래 형으로 다운캐스팅 ]");
        animalTest.testCasting();
    }

    public void addAnimal() {
        animalList.add(new Human());
        animalList.add(new Tiger());
        animalList.add(new Eager());

        for (Animal animal : animalList) {
            animal.move();
        }
    }

    public void testCasting() {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);

            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBook();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Eager) {
                Eager eager = (Eager) animal;
                eager.flying();
            } else {
                System.out.println("지원하지 않는 형입니다.");
            }
        }
    }
}




