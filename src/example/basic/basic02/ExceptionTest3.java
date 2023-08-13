package example.basic.basic02;

public class ExceptionTest3 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("시스템 종료");
        }
    }
}
