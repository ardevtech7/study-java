package example.ex04.objectclass.ex01;

public class WrapperClassTest {
    public static void main(String[] args) {
        Integer iValue = new Integer("1000");

        int myValue = iValue.intValue();
        int myValue2 = Integer.valueOf(iValue);
        int myValue3 = Integer.parseInt("1000");

        System.out.println(myValue);
        System.out.println(myValue2);

    }
}
