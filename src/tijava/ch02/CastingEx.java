package tijava.ch02;

// 강제형변환
public class CastingEx {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);

        int var3 = 65;
        char var4 = (char) var3;
        System.out.println(var4);

        // 실수 -> 정수로 변환할 때 소숫점은 버려진다.
        double var5 = 3.14;
        int var6 = (int) var5;
        System.out.println(var6);
    }
}
