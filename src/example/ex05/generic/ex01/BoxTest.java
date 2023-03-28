package example.ex05.generic.ex01;

public class BoxTest {
    public static void main(String[] args) {
        Box<String> box = new Box<>("hello");
        String content1 = box.getContent();
        System.out.println(content1);

        Box<Integer> box1 = new Box<>(111);
        Integer content2 = box1.getContent();
        System.out.println(content2);
    }
}
