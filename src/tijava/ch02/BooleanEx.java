package tijava.ch02;

public class BooleanEx {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("멈춰");
        } else {
            System.out.println("시작");
        }

        int x = 10;
        boolean ans = (x > 20);
        System.out.println(ans);
    }
}
