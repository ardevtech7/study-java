package tijava.ch05;

public class CharAtEx {
    // 주민번호에서 성별에 해당하는 7번째 문자 읽고, 여,남 구분
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int length = ssn.length();
        char sex = ssn.charAt(6);

        if (length == 13) {
            switch (sex) {
                case '1':
                case '3' :
                    System.out.println("남자");
                    break;
                case '2':
                case '4' :
                    System.out.println("여자");
                    break;
            }
        } else {
            System.out.println("주민 번호가 틀렸습니다.");
        }

    }
}
