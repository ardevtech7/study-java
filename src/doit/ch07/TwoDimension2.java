package doit.ch07;

public class TwoDimension2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // 2행 3열

        for (int i = 0; i < arr.length; i++) { // i = 행, arr.length = 행의 개수
            for (int j = 0; j < arr[i].length; j++) { // j = 열, arr[i].length = 열의 개수
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("행의 길이 : " + arr.length);
        System.out.println("열의 길이 : " + arr[0].length);
    }
}
