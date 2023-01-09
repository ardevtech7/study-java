package example.ex02.array01;

public class ArrayTest {
    public static void main(String[] args) {
        int[] num1 = new int[] {1,2,3,4,5};
        int[] num2 = {1,2,3,4,5};

        int[] num3;
        num3 = new int[] {1,2,3,4,5};

        for (int i = 0; i < num1.length ; i++) {
            System.out.println(num1[i]);
        }
    }
}
