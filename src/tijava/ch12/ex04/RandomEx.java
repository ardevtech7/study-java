package tijava.ch12.ex04;

import java.util.Arrays;
import java.util.Random;

/*
Random 클래스의 random()
 */
public class RandomEx {
    public static void main(String[] args) {
        // 선택 번호
        int[] selectNumber = new int[6];
        Random random = new Random(3);
        System.out.print("선택 번호 : ");
        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45) + 1; // 0 ~ 44 로 생성되니 + 1하면, 1 ~ 45
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        // 당첨 번호
        int[] winningNumber = new int[6];
        Random random1 = new Random(5);
        System.out.print("당첨 번호 : ");
        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random1.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");
        }
        System.out.println();

        // 당첨 여부
        // 비교하기 전에 배열 항목 정렬
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        // 배열 항목 비교하기
        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.print("당첨 여부 : ");
        if (result) {
            System.out.println("1등 당첨");
        } else {
            System.out.println("열심히 사세요");
        }
    }
}
