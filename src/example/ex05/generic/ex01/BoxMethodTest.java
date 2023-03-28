package example.ex05.generic.ex01;

public class BoxMethodTest {
    // 제네릭 메소드
    // <T> : 타입 파라미터 정의
    // BoxMethod<T> : 리턴 타입
    public static <T> BoxMethod<T> boxing(T t) {
        BoxMethod<T> boxMethod = new BoxMethod<>();
        boxMethod.setT(t);
        return boxMethod;
    }
    public static void main(String[] args) {
        // 제네릭 메소드 호출
        BoxMethod<Integer> box1 = boxing(100);
        Integer t = box1.getT();
        System.out.println(t);

        BoxMethod<String> hello = boxing("Hello");
        String t1 = hello.getT();
        System.out.println(t1);
    }
}
