package example.ex07.exception;

public class IDFormatTest {
    public static void main(String[] args) {
        IDFormat test = new IDFormat();

        // null 예외 처리
        String userID = null;
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        // 글자수 예외 처리
        userID = "1234567";
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
