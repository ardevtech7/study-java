package tijava.ch02;

// 자동형변환
// byte < short, char < int < long < float < double
// 1bit = 8byte
public class PromotionEx {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);

        char charValue = '가';
        int intValue1 = charValue;
        System.out.println(intValue1); // 유니코드 값으로 출력

        float floatValue = 100.7F;
        double doubleValue = floatValue;
        System.out.println(doubleValue);
    }
}
