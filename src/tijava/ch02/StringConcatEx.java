package tijava.ch02;

public class StringConcatEx {
    public static void main(String[] args) {
        // 숫자 연산
        int result1 = 10 + 2 + 8;
        System.out.println("result1 : " + result1);

        // 결합 연산
        String result2 = 10 + 2 + "8";
        System.out.println("result2 : " + result2);

        String result3 = "10" + (2 + 8);
        System.out.println("result3 : " + result3);
    }
}
