package example.ex05.generic.generics04;

public class Box <T, K> {
    public T content;
    public K number;

    public T getContent() {
        return content;
    }

    public K getNumber() {
        return number;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void setNumber(K number) {
        this.number = number;
    }

}
