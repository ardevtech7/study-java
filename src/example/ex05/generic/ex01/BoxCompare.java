package example.ex05.generic.ex01;

public class BoxCompare <T> {
    public T content;

    // Box 의 내용물이 같은지 비교
    public boolean compare(BoxCompare<T> other) {
        boolean result = content.equals(other.content);
        return result;
    }
}
