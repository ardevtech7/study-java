package example.ex09;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new Stack<>();
        List<String> list3 = new Vector<>();

        // 선언
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3)); // [1, 2, 3]
        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("AAA");
        strArr.add("BBB");
        strArr.add("CCC");

        strArr.add(2, "QQQ"); // [AAA, BBB, QQQ, CCC]
        String s = strArr.get(0); // AAA
        int index = strArr.indexOf("CCC"); // 2

        strArr.sort(Comparator.naturalOrder()); // 오름차순 [AAA, BBB, CCC, QQQ]
        strArr.sort(Comparator.reverseOrder()); // 내림차순 [QQQ, CCC, BBB, AAA]

        System.out.println(strArr);
    }
}
