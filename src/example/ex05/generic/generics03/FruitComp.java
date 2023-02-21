package example.ex05.generic.generics03;

import java.util.Comparator;

public class FruitComp implements Comparator<Fruit> {
    @Override
    public int compare(Fruit t1, Fruit t2) {
        return t1.weight - t2.weight;
    }
}
