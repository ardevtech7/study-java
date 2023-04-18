package doit.ch10.ex01;

// 우선순위에 따라
public class PriorityAllocation implements Schedule {
    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 높은 전화 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 스킬 높은 사람에게 우선 배분");
    }
}
