package tijava.ch07.ex03;

// 필드 다형성--
public class Car {
    public Tire tire; // Tire 를 KumhoTire & HankookTire 에서 상속

    public void run() {
        // tire 필드에 대입된 객체의 roll() 메소드 호출
        tire.roll();
    }
}
