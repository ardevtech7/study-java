package example.ex03.interfaceex.ex06;

public class Television implements RemoteController{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Tv On");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv Off");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(volume);
    }

}
