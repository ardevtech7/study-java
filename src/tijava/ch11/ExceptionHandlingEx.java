package tijava.ch11;

public class ExceptionHandlingEx {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수 : " + result);
        } catch (NullPointerException e) {
            // 예외를 얻는 3가지 방법
            System.out.println(e.getMessage()); // (1) 예외가 발생한 이유
            System.out.println(e.toString()); // (2) 예외 종류도 같이 리턴
            e.printStackTrace(); // (3) 예외가 어디서 발생했는지 추적한 내용까지 출력
        } finally {
            System.out.println("[마무리 실행]\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("프로그램 종료");
    }
}
