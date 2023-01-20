package example.ex03.abstractex.ex01;

public class DeskTop extends Computer{
    @Override
    public void display() {
        System.out.println("DeskTop display()");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing()");
    }
}
