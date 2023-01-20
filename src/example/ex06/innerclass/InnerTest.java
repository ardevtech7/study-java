package example.ex06.innerclass;

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        OutClass.InClass inClass = outClass.new InClass();
        inClass.usingClass();
    }
}
