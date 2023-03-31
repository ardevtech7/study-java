package tijava.ch03;

public class CompareOperatorEx {
    public static void main(String[] args) {
        char char1 = 'A';
        char char2 = 'B';
        boolean result1 = char1 > char2; // 65 < 66
        System.out.println("result1 : " + result1);

        // 결과가 모두 true 가 산출되어야 하지만, result2 는 false 이다.
        // 이유는 부동 소수점 방식을 사용하는 실수 타입은 0.1 을 정확히 표현할 수 없고,
        // float, double 의 정밀도 차이 때문이다.
        float v1 = 0.1f;
        double v2 = 0.1;
        boolean result2 = (v1 == v2);
        boolean result3 = (v1 == (float) v2); // 해결책
        System.out.println("result2 : " + result2); // false
        System.out.println("result3 : " + result3); // true

        String str1 = "자바";
        String str2 = "java";
        boolean result4 = (str1.equals(str2));
        boolean result5 = (!str1.equals(str2));
        System.out.println("result4 : " + result4); // true
        System.out.println("result5 : " + result5); // true
    }
}
