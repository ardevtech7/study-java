package example.ex05.generic.generics04;

public class GenericExample {
    public static void main(String[] args) {
        Box<String, Integer> box = new Box<>();
        box.content = "Content";
        box.number = 10;

        String content = box.content;
        Integer number = box.number;
        System.out.println(content + "," + number);

        box.setContent("Hello");
        box.setNumber(100);
        System.out.println(box.getContent() + "," + box.getNumber());
    }
}
