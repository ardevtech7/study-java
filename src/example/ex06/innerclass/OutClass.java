package example.ex06.innerclass;

public class OutClass {
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    /**
     * 인스턴스 내부 클래스
     */
    class InClass {
        int inNum = 100;

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스 정적 변수)");
        }

        public void usingClass() {
            inClass.inTest();
        }
    }
}
