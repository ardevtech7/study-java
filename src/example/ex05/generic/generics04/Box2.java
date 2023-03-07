package example.ex05.generic.generics04;

public class Box2 <K> {
    public K number;

    public boolean compare(Box2<K> other) {
        boolean result = number.equals(other.number);
        return result;
    }
}
