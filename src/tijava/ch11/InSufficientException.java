package tijava.ch11;

// 사용자 정의 예외
public class InSufficientException extends Exception {
    public InSufficientException() {

    }

    public InSufficientException(String message) {
        super(message);
    }
}
