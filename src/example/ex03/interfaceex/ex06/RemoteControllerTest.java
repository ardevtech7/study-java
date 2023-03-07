package example.ex03.interfaceex.ex06;

public class RemoteControllerTest {
    public static void main(String[] args) {
        RemoteController remoteController = new Television();
        remoteController.turnOn();

        System.out.println(RemoteController.MAX_VOLUME);
        System.out.println(RemoteController.MIN_VOLUME);

        remoteController.turnOff();
        remoteController.setVolume(10);

        RemoteController remoteController1 = new Audio();
        remoteController1.turnOn();
        remoteController1.turnOff();
        remoteController1.setVolume(100);

        remoteController1.setMute(true);
    }
}
