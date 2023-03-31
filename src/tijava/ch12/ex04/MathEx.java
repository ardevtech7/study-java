package tijava.ch12.ex04;

public class MathEx {
    public static void main(String[] args) {
        // 큰 정수 또는 작은 정수 얻기
        double v1 = Math.ceil(5.3); // 올림값
        double v2 = Math.floor(5.3); // 버림값
        System.out.println("v1 : " + v1);
        System.out.println("v2 : " + v2);

        // 큰값 또는 작은값 얻기
        int v3 = Math.max(4, 6);
        int v4 = Math.min(3, 6);
        System.out.println("v3 : " + v3);
        System.out.println("v4 : " + v4);

        // 소수 이하 두 자리 얻기
        double value = 12.134;
        double temp1 = value * 100; // 1213.4
        long temp2 = Math.round(temp1); // 1213
        double v5 = temp2 / 100.0; // 12.13
        System.out.println("v5 : " + v5);
    }
}
