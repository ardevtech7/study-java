package tijava.ch05.array;

public class ArrayCreateByValueListEx1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winder"};

        for (String str : season) {
            System.out.println(str);
        }
        System.out.println();

        season[1] = "여름";
        System.out.println(season[1]);

        System.out.println("점수 총합, 평균 구하기");
        int sum = 0;
        int[] score = {83,90,87};
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + (double)sum/score.length);
    }
}
