package example.basic.basic03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class hashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(1,2,3));
        System.out.println(hashSet);

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
