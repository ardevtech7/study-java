package example.basic.basic02;

public class ExceptionTest {
    public static void main(String[] args) {
        String[] name = new String[2];

        try {
            name[0] = "아이유";
            System.out.println(name[0]);

            name[1] = "트와이스";
            System.out.println(name[1]);

            name[2] = "아이브";
            System.out.println(name[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("!!! 배열 참조 에러 발생 !!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("시스템 종료");
        }
    }
}
