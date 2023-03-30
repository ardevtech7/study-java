package tijava.ch02;

// 연산식에서 자동 타입 변환
public class OperationPromotionEx {
    public static void main(String[] args) {

        byte result1 = 10 + 20; // 컴파일 단계에서 연산
        System.out.println("result1 : " + result1);

        byte v1 = 10;
        byte v2 = 20;
//        byte c = a + b;
        int result2 = v1 + v2; // byte 타입 변수가 피연산자로 사용된 경우, 변수값은 int 타입으로 변환되어 연산
        System.out.println("result2 : " +result2);

        short v3 = 10;
        short v4 = 20;
//        short f = d + e;
        int result3 = v3 + v4;
        System.out.println("result3 : " + result3);

        byte v5 = 10;
        int v6 = 100;
        long v7 = 1000L;
        long result4 = v5 + v6 + v7;
        System.out.println("result4 : " + result4);

        char v8 = 'A';
        char v9 = 1;
        int result5 = v8 + v9;
        System.out.println("result5 : " + result5);
        System.out.println("result5 : " + (char)result5);

        int v10 = 10;
        int result6 = v10/4;
        System.out.println("result6 : " + result6);

        int v11 = 10;
        double result7 = v11/4.0;
        System.out.println("result7 : " + result7);

        float result8 = 1.2f + 1.2f;
        System.out.println("result8 : " + result8);

        // float 타입이 double 타입으로 자동 변환되어 연산
        double result9 = 1.2f + 1.2;
        System.out.println("result9 : " + result9);

        int v12 = 5;
        int v13 = 2;

        double result10 = v12 / v13;
        System.out.println("result10 : " + result10); // 2.0

        double result11 = (double) v12 / v13; // 방법 1
        System.out.println("result11 : " + result11);

        double result12 = v12 / (double) v13; // 방법 2
        System.out.println("result12 : " + result12);

        double result13 = (double) v12 / (double) v13; // 방법 3
        System.out.println("result13 : " + result13);

        double result14 = (double) (v12 / v13);
        System.out.println("result14 : " + result14);
    }
}
