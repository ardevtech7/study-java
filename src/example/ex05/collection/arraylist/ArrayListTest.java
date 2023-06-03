package example.ex05.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3,"AA");
        System.out.println(list2);

        Iterator it = list1.listIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            System.out.println(ob);
        }
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("ArrayListEx 1: " + list1);
        System.out.println("ArrayListEx 2: " + list2);
        System.out.println();
    }
}
