package tijava.ch03;

public class IncreaseDecreaseOperatorEx {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; // 11
        ++x; // 12
        System.out.println("x = " + x);

        System.out.println("---------------");
        y--; // 9
        --y; // 8
        System.out.println("y = " + y);

        System.out.println("---------------");
        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("---------------");
        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("---------------");
        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
