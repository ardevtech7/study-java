package example.ex03.interfaceex.ex02;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요");
        System.out.println("R: 한명씩 차례대로 할당");
        System.out.println("L: 쉬고 있거나 대기가 적은 상담원에게 할당");
        System.out.println("P: 우선순위가 높은 고객에게 먼저 할당");

        int ch = System.in.read();

        // RoundRobin, LeastJob, PriorityAllocation 클래스로 생성한 인스턴스는 모두 Scheduler 형 변수에 대입 가능.
        Scheduler scheduler = null;
        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p' ) {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }
        // 사용할 인스턴스가 어떤 클래스로 생성되었는지와 상관없이 인터페이스에서 제공하는 메서드 호출
        scheduler.getNextCall();
        scheduler.sendToAgent();
    }
}
