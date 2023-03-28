package example.ex05.generic.ex01;

public class BoxCompareTest {
    public static void main(String[] args) {
        BoxCompare boxCompare1 = new BoxCompare();
        boxCompare1.content = "100";

        BoxCompare boxCompare2 = new BoxCompare();
        boxCompare2.content = "100";

        BoxCompare boxCompare3 = new BoxCompare();
        boxCompare3.content = 100;

        boolean equals = boxCompare1.compare(boxCompare2);
        System.out.println(equals);

        boolean equals1 = boxCompare2.compare(boxCompare3);
        System.out.println(equals1);
    }
}
