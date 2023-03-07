package example.ex05.generic.generics04;

public class GenericExample2 {
    public static void main(String[] args) {
        Box2<Integer> box1 = new Box2<>();
        box1.number = 100;

        Box2<Integer> box2 = new Box2<>();
        box2.number = 200;

        boolean result1 = box1.compare(box2);
        System.out.println(result1);

    }
}
