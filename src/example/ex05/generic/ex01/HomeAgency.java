package example.ex05.generic.ex01;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() { // 리턴 타입은 반드시 Home
        return new Home();
    }
}
