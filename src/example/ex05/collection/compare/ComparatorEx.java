package example.ex05.collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
    public static void main(String[] args) {
        String[] newArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(newArr);
        System.out.println("String의 Comparable 구현에 의한 정렬: " + Arrays.toString(newArr));

        Arrays.sort(newArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("대소문자 구분 안하고 출력: " + Arrays.toString(newArr));

        Arrays.sort(newArr, new Descending());
        System.out.println("역순 정렬: " + Arrays.toString(newArr));
    }
}

class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;
        }
        return -1;
    }
}