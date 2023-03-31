package tijava.ch03;

public class AccuracyEx1 {
    public static void main(String[] args) {
        int apple = 1; // 사과 1개를 0.1 단위 10 조각으로 본다.
        double pieceUnit = 0.1;
        int number = 7; // 그 중 7조각(0.7)을 뺀 3조각(0.3)을 result 에 저장

        double result = apple - number * pieceUnit;

        System.out.println("사과 1개에서 남은 양 : " + result);
    }
}
