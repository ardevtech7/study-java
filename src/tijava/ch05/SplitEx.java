package tijava.ch05;

public class SplitEx {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        // 문자열 분리
        String[] token = board.split(",");

        // 인덱스별로 읽기
        System.out.println("번호 : " + token[0]);
        System.out.println("제목 : " + token[1]);
        System.out.println("내용 : " + token[2]);
        System.out.println("이름 : " + token[3]);

        System.out.println();
        // for 문 사용
        for (String str: token) {
            System.out.println(str);
        }
    }
}
