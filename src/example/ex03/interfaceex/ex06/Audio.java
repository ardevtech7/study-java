package example.ex03.interfaceex.ex06;

public class Audio implements RemoteController{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio On");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio Off");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(volume);
    }
}
