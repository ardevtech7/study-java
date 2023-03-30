package tijava.ch02;

public class CharEx {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1);
        System.out.println(c2);

        // 컴파일 오류 케이스
        // (1) 빈 문자열
//        char c3 = '';

        // (2) 큰 따음표
//        char c4 = "A";

        // 공백 (유니코드 32)
        char c5 = ' ';
        System.out.println(c5);
    }
}
