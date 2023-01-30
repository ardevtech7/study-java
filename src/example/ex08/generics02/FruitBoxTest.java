package example.ex08.generics02;

import java.util.Collections;

public class FruitBoxTest {
    public static void main(String[] args) {
        FruitBox<Apple> appleFruitBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeFruitBox = new FruitBox<Grape>();

        appleFruitBox.add(new Apple("GreenApple", 300));
        appleFruitBox.add(new Apple("GreenApple", 100));
        appleFruitBox.add(new Apple("GreenApple", 200));

        grapeFruitBox.add(new Grape("RedGrape", 500));
        grapeFruitBox.add(new Grape("RedGrape", 600));
        grapeFruitBox.add(new Grape("RedGrape", 800));

//        Collections.sort(appleFruitBox.getList(), new AppComp());
//        Collections.sort(grapeFruitBox.getList(), new GrapeComp());

        Collections.sort(appleFruitBox.getList(), new FruitComp());
        Collections.sort(grapeFruitBox.getList(), new FruitComp());

        System.out.println(appleFruitBox);
        System.out.println(grapeFruitBox);
    }
}
//class AppComp implements Comparator<Apple> {
//    @Override
//    public int compare(Apple t1, Apple t2) {
//        return t1.weight - t2.weight;
//    }
//}
//
//class GrapeComp implements Comparator<Grape> {
//    @Override
//    public int compare(Grape t1, Grape t2) {
//        return t1.weight - t2.weight;
//    }
//}
