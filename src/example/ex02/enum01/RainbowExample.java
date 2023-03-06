package example.ex02.enum01;

public class RainbowExample {
    public static void main(String[] args) {
        Rainbow[] arr = Rainbow.values();
        for(Rainbow rb : arr) {
            System.out.println(rb);
        }

        Rainbow rb = Rainbow.valueOf("RED");
        System.out.println(rb);
        System.out.println(rb.getColor());
        System.out.println(rb.getNum());

        for (Rainbow rb2 : Rainbow.values()) {
            System.out.println(rb.getColor());
        }
    }
}
