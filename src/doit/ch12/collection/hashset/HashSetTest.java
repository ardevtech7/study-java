package doit.ch12.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        // String 클래스에 객체가 동일한 경우에 대한 처리 방법이 이미 구현
        hashSet.add("a");
        hashSet.add("a");
        hashSet.add("b");
        System.out.println(hashSet);
    }
}
