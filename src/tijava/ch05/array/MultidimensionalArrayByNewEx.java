package tijava.ch05.array;

public class MultidimensionalArrayByNewEx {
    public static void main(String[] args) {
        // 각 반의 학생 수가 동일할 경우
        int[][] mathScores = new int[2][3];

        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println("초기값 - mathScores[" + i + "]" + "[" + j + "] : " + mathScores[i][j]);
            }
        }

        // 각 반의 학생 수가 다를 경우
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

    }
}
