package example.ex05.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        HashMap<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("김자바", 10);
        map.put("이자바", 20);
        map.put("박자바", 30);
        map.put("김자바", 40); // key 값 중복으로 미출력
        System.out.println(map);
        System.out.println("총 Entry 개수 : " + map.size());

        // 키로 값 얻기
        String key = "김자바";
        Integer value = map.get(key);
        System.out.println("김자바 value : " + value);
        System.out.println();

        // 키 Set 컬렉션 얻고, 반복해서 키와 값 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ": " + v);
        }
        System.out.println();

        // Entry Set 컬렉션을 얻고, 반복해서 키와 값 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println(entrySet);

        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> next = entryIterator.next();
            String k = next.getKey();
            Integer v = next.getValue();
            System.out.println("Key : " + k + ", Value : " + v);
        }
    }
}
