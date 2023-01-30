package example.ex04.objectclass.ex02;

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point = new Point(10,20);
        Circle circle = new Circle(point,30);
        Circle cocyCircle = (Circle) circle.clone();

        System.out.println(circle);
        System.out.println(cocyCircle);

        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(cocyCircle));
    }
}
