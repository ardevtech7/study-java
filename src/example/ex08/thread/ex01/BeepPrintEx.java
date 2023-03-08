package example.ex08.thread.ex01;

import java.awt.*;

/**
 * 0.5 초 주기로 비프음 발생시키면서, 동시에 프린팅 수행
 * 두 작업 중 하나를 작업 스레드에서 처리하도록 구현
 */
public class BeepPrintEx {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            // 작업 스레드 생성
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        // 작업 스레드 실행
        thread.start();

        // 메인 스레드 실행
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
