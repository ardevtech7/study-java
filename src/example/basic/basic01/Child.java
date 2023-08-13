package example.basic.basic01;

public class Child extends Parents {
    @Override
    public void inheritance() {
        super.inheritance();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.inheritance();
    }
}
