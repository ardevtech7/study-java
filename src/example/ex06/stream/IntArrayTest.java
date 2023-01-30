package example.ex06.stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class IntArrayTest {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int sumVal = Arrays.stream(arr).sum();
//        int count = (int) Arrays.stream(arr).count();
//
//        System.out.println(sumVal);
//        System.out.println(count);

        double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0};
        OptionalDouble average = Arrays.stream(arr).average();
        System.out.println(average);
    }
}
