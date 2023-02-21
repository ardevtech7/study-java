package example.ex05.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", new Integer(90));
        map.put("이자바", new Integer(100));
        map.put("박자바", new Integer(100));
        System.out.println(map);

        Set set = map.entrySet();
        System.out.println(set);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println("이름: " + entry.getKey() + ", 점수: " + entry.getValue());
        }
    }
}
