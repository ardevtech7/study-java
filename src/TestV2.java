import java.util.HashMap;

public class TestV2 {
    public static void main(String[] args) {
        Integer a = new Integer(5);
        Integer b = Integer.valueOf(5);
        System.out.println(a);
        System.out.println(b);

        int value = 10;
        String str = Integer.toString(value);
        System.out.println(str);

        HashMap<String, String> hash = new HashMap<>();
        hash.put("test","Error");
        System.out.println(hash.get("test"));
    }
}
