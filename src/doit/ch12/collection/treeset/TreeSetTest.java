package doit.ch12.collection.treeset;

import java.util.TreeSet;

// TreeSet : 중복 X, 출력 값을 정렬
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("b");
        treeSet.add("a");
        treeSet.add("d");

        for (String str : treeSet) {
            System.out.println(str);
        }
    }
}
