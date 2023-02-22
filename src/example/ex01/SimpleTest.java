package example.ex01;

public class SimpleTest {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.setChannel(7);
        tv1.setColor("blue");
        int tv1Number = Tv.number;

        tv1.channelDown();
        System.out.println("tv1 ==> " + tv1 + ", number ==> " + tv1Number);

        Tv tv2 = new Tv();
        tv2.setChannel(2);
        tv2.channelDown();
        System.out.println("tv2 ==> " + tv2);

        tv2 = tv1;
        System.out.println("tv2==tv1 >>> " + tv2);

        Tv[] tvArr = new Tv[3];
        tvArr[0] = new Tv("blue", 1);
        System.out.println(tvArr[0]);
    }
}

class Tv {
    private String color;
    private int channel;
    static int number = 100;

    public Tv() {
    }

    public Tv(String color, int channel) {
        this.color = color;
        this.channel = channel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "color='" + color + '\'' +
                ", channel=" + channel +
                '}';
    }

    public void channelUp() {
        ++channel;
    }

    public void channelDown() {
        --channel;
    }
}
