package example.ex05.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(new String("A"));
        hashSet.add(new String("B"));
        hashSet.add(new String("A"));

        System.out.println(hashSet);
    }
}
