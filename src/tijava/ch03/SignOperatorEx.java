package tijava.ch03;

// 부호/증감 연산자
public class SignOperatorEx {
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println("x : " + x);

        byte b = 100;
//        byte result = -b; // 정수 타입(byte, short, int) 연산의 결과는 int 타입
        int y = -b;
        System.out.println("y : " + y);
    }
}
