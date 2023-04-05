package tijava.ch05.array;

public class ArrayCreateByValueListEx2 {
    public static void main(String[] args) {
        // 배열 선언 시 주의사항
        int[] scores;
//        scores = {10,30};
        scores = new int[] {10,20,30};

        // new 연산자
        int[] test;
        test = new int[5];

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
        printItem(scores);
    }
    public static void printItem(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] : " + scores[i]);
        }
    }
}
