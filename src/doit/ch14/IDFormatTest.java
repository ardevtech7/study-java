package doit.ch14;

public class IDFormatTest {
    private String userId;
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) throws IDFormatException {
        if (userId == null) {
            throw new IDFormatException("아이디 null 불가");
        } else if (userId.length() < 8 || userId.length() > 20) {
            throw new IDFormatException("아이디는 8 ~ 20 이하로 등록");
        }
        this.userId = userId;
    }
    public static void main(String[] args) {
        IDFormatTest idFormatTest = new IDFormatTest();

        String userId = null;
        try {
            idFormatTest.setUserId(userId);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        userId = "123456";
        try {
            idFormatTest.setUserId(userId);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
