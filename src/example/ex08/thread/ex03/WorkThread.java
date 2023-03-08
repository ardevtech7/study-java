package example.ex08.thread.ex03;

public class WorkThread extends Thread{
    public boolean work = true;

    public WorkThread(String name){
        setName(name);
    }

    @Override
    public void run() {
        while (true) {
            if (work) {
                System.out.println(getName() + " 작업 처리");
            } else {
                Thread.yield(); // 다른 스레드에게 양보
            }
        }
    }
}
