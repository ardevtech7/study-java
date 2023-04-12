package doit.ch07;

public class TwoDimension {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}};

        for (int i = 0; i < arr.length; i++) { // i = 행, arr.length = 행의 개수
            for (int j = 0; j < arr[i].length; j++) { // j = 열, arr[i].length = 열의 개수
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
