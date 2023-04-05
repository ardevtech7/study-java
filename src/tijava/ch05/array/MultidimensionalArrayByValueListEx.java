package tijava.ch05.array;

// 2차원 배열
public class MultidimensionalArrayByValueListEx {
    public static void main(String[] args) {
        // 2차원 배열 생성
        int[][] scores = {
                {80, 90, 96}, // 1번 반
                {76, 88} // 2번 반
        };

        // 배열 길이 (반의 수, 학생 수)
        System.out.println("배열 길이 (반의 수) : " + scores.length);
        System.out.println("2차원 배열 길이 (1번 반 학생 수) : " + scores[0].length);
        System.out.println("2차원 배열 길이 (2번 반 학생 수) : " + scores[1].length);

        // 1번 반 3번째 학생 점수
        System.out.println("score[0][2] : " + scores[0][2]);
        // 2번 반 2번째 학생 점수
        System.out.println("score[1][1] : " + scores[1][1]);

        // 1번 반 평균
        int class1Sum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i];
        }
        double class1Ave = (double) class1Sum/scores[0].length;
        System.out.println("1번 반 평균 : " + class1Ave);

        // 2번 반 평균
        int class2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i];
        }
        double class2Ave = (double) class2Sum/scores[1].length;
        System.out.println("1번 반 평균 : " + class2Ave);

        // 전체 학생의 평균
        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < scores.length; i++) {
            totalStudent += scores[i].length;
            for (int j = 0; j < scores[i].length; j++) {
                totalSum += scores[i][j];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 학생 평균 : " + totalAvg);

    }
}
