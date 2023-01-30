package example.ex06.lambda;

@FunctionalInterface
// 제네릭 타입 T를 가진 함수형 인터페이스
public interface MyFunction3<T> {
    void print(T x); // 람다식으로 구현할 추상 메소드
}
