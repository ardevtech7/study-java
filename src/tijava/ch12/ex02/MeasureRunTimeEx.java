package tijava.ch12.ex02;

public class MeasureRunTimeEx {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }

        long endTime = System.nanoTime();
        System.out.println("합 : " + sum);
        System.out.println("소요시간 : " + (endTime - startTime));
    }
}
