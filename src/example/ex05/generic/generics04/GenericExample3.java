package example.ex05.generic.generics04;

public class GenericExample3 {

    public static <T> Box3<T> boxing(T t) {
        Box3<T> box3 = new Box3<>();
        box3.setT(t);
        return box3;
    }

    public static void main(String[] args) {
        Box3<Integer> boxing = boxing(100);
        Integer t = boxing.getT();
        System.out.println(t);

        Box3<String> boxing1 = boxing("hello");
        String t1 = boxing1.getT();
        System.out.println(t1);
    }
}
