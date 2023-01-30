package example.ex08.generics;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
//        fruitBox.add(new Toy());

        appleBox.add(new Apple());
//        appleBox.add(new Fruit());
//        appleBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(fruitBox.get(1));
        System.out.println(appleBox);
    }
}
