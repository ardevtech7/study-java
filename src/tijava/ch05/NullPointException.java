package tijava.ch05;

public class NullPointException {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10;
//        System.out.println(intArray);

        String str = null;
//        System.out.println(str.length());

    }
}
