package tijava.ch07.ex07;

public abstract class Animal {
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    // 추상 메소드는 메소드 실행 내용인 중괄호 {} 미사용
    public abstract void sound();
}
