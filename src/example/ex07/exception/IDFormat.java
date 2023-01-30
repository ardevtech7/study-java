package example.ex07.exception;

public class IDFormat {
    private String userID;
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) throws IDFormatException {
        if (userID == null) {
            throw new IDFormatException("아이디는 널일 수 없습니다.");
        } else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
        }
        this.userID = userID;
    }
}