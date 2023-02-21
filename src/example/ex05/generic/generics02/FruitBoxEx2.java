package example.ex05.generic.generics02;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Apple());

        appleFruitBox.add(new Apple());
        appleFruitBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleFruitBox));
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";

        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}