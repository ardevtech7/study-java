package doit.ch10.ex01;

// 순서대로 분배
public class RoundRobin implements Schedule {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 대기열에서 순서대로 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서 상담원에게 배분");
    }
}
