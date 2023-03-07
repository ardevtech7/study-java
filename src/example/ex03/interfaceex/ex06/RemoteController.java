package example.ex03.interfaceex.ex06;

public interface RemoteController {
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // public 추상 메소드
    public void turnOn();

    // 추상 메소드
    void turnOff();
    void setVolume(int volume);

    // default 인스턴스 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("Mute!!");
        } else {
            System.out.println("Volume Up!!");
        }
    }

}
