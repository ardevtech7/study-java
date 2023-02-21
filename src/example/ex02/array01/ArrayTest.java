package example.ex02.array01;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
//        int[] num1 = new int[] {1,2,3,4,5};
//        int[] num2 = {1,2,3,4,5};
//        int[] num3;
//        num3 = new int[] {1,2,3,4,5};
//
//        for (int i = 0; i < num1.length ; i++) {
//            System.out.println(num1[i]);
//        }

        String[] str = {"a", "b", "c"};
        List<String> strList = Arrays.asList(str);
        System.out.println(strList);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        System.out.println(list1);

    }
}
