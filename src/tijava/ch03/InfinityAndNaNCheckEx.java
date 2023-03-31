package tijava.ch03;

public class InfinityAndNaNCheckEx {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
//        double z1 = x % y;

        // Infinity, NaN
        System.out.println(z + 2);
//        System.out.println(z1 + 3);

        // 알맞은 코드
        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }
}
