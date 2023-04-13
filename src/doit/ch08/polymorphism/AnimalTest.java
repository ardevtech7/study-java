package doit.ch08.polymorphism;

class Animal {
    public void move() {
        System.out.println("동물이 움직인다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네 발로 걷습니다.");
    }
}

class Eager extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.moveAnimal(new Human());
        animalTest.moveAnimal(new Tiger());
        animalTest.moveAnimal(new Eager());
    }

    // 어떤 인스턴스가 매개변수로 넘어와도 모두 Animal 형으로 변환
    // Ex) Animal ani = new Human();
    void moveAnimal(Animal animal) { // 매개변수의 자료형이 상위 클래스
        animal.move(); // 재정의된 메서드가 호출
    }
}




