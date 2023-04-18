package doit.ch10.ex01;

// 각 상담원에게 전화 업무 분배
public interface Schedule {
    public void getNextCall(); // 다음 전화를 가져오는 기능
    public void sendCallToAgent(); // 상담원에게 전화를 배분하는 기능
}
