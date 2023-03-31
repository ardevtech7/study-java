package tijava.ch12.ex01;

public class EqualsEx {
    public static void main(String[] args) {
        Member obj1 = new Member("abc");
        Member obj2 = new Member("abc");
        Member obj3 = new Member("zzz");

        if (obj1.equals(obj2)) {
            System.out.println("obj1 과 obj2 는 동등");
        } else {
            System.out.println("obj1 과 obj2 는 동등하지 않다.");
        }

        if (obj1.equals(obj3)) {
            System.out.println("obj1 과 obj3 는 동등");
        } else {
            System.out.println("obj1 과 obj3 는 동등하지 않다.");
        }

    }
}
