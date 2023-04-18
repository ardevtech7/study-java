package doit.ch10.ex01;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.print("입력 : ");
        int ch = System.in.read();

        Schedule schedule = null;

        if (ch == 'R' || ch == 'r') {
            schedule = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            schedule = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            schedule = new PriorityAllocation();
        } else {
            System.out.println("미지원");
        }

        schedule.getNextCall();
        schedule.sendCallToAgent();
    }
}
