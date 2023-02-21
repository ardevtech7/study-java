package example.ex05.collection.hashset;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(new String("A"));
        hashSet.add(new String("B"));
        hashSet.add(new String("A"));
        System.out.println(hashSet);

        //
        Object[] objects = {"1", new Integer(1), "2", "3"};

        Set set = new HashSet();
        for (int i = 0; i < objects.length; i++) {
            set.add(objects[i]);
        }
        System.out.println(set);

        // 1 ~ 45
        Set set1 = new HashSet();
        for (int i = 0; set1.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set1.add(num);
        }

        List list = new ArrayList(set1);
        Collections.sort(list);
        System.out.println("1~45까지 랜덤한 숫자를 정렬: " + list);
    }
}
