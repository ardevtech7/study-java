package doit.ch10.ex01;

// 짧은 대기열 먼저
public class LeastJob implements Schedule {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 대기열에서 순서대로 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("대기가 적은 상담원에게 할당");
    }
}
