package example.ex06.lambda;

// 함수형 인터페이스
@FunctionalInterface
public interface MyFunction {
    // 람다식으로 구현할 추상 메소드
    int calc(int x, int y);
}
