package example.ex09;

import java.math.BigDecimal;

public class 사칙연산 {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("0.001");
        BigDecimal num2 = new BigDecimal("0.002");

        BigDecimal add = num1.add(num2);
        System.out.println(add);

        if (num1.compareTo(num2) == 1) {
            System.out.println("num1 > num2");
        } else if (num1.compareTo(num2) == 0) {
            System.out.println("num1 == num2");
        } else {
            System.out.println("num1 < num2");
        }
    }
}
