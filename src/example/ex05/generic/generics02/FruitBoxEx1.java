package example.ex05.generic.generics02;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
//        fruitBox.add(new Toy());

        appleBox.add(new Apple());
//        appleBox.add(new Fruit());
//        appleBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(fruitBox.get(1));
        System.out.println(appleBox);

        // 타입 종류 제한 예제
        FruitBox<Apple> fruitBox1 = new FruitBox<>();
//        FruitBox<Toy> fruitBox2 = new FruitBox<Toy>();
        FruitBox<Fruit> fruitBox2 = new FruitBox<>();
        fruitBox2.add(new Apple());
//        fruitBox2.add(new Toy());

    }
}
