package example.ex09;

public class 배수연산 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int j = 2;

        // 1 ~ 100 사이의 2의 배수 10개 넣기
        for (int i = 0; i < a.length; i++) {
            a[i] = j;
            j += 2;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
