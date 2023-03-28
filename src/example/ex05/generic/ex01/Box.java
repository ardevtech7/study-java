package example.ex05.generic.ex01;

public class Box <T> {
    public T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

}
