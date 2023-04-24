package doit.ch11.equalhash;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Circle implements Cloneable {
    Point point;
    int radius;

    public Circle(int x, int y, int radius) {
        this.radius = radius;
        this.point = new Point(x, y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10, 20, 30);
        Circle copyCircle = (Circle) circle.clone();

        System.out.println(circle);
        System.out.println(copyCircle);

        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));
    }
}
