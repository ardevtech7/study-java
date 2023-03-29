public class Test {
    public static void main(String[] args) {
        String a = "100";
        String b = "abc";

        int intValue = Integer.parseInt(a);
        System.out.println(intValue);

        // NumberFormatException
        int stringValue = Integer.parseInt(b);
        System.out.println(stringValue);
    }
}
