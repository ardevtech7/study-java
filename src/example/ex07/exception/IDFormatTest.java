package example.ex07.exception;

public class IDFormatTest {
    public static void main(String[] args) {
        IDFormat test = new IDFormat();

        String userID = null;
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        userID = "1234567";
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
