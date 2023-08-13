package example.basic.basic02;

public class MyExceptionTest {
    static void callException() throws MyException {
        throw new MyException();
    }
    public static void main(String[] args) {
        try {
            callException();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("시스템 종료");
        }
    }
}
