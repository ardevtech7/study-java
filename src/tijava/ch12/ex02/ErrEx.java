package tijava.ch12.ex02;

public class ErrEx {
    public static void main(String[] args) {
        try {
            int value = Integer.parseInt("1oo");
        } catch (NumberFormatException e) {
            System.out.println("[에러 내용]");
            System.out.println(e.getMessage());

            System.err.println("[에러 내용]");
            System.err.println(e.getMessage());
        }
    }
}
