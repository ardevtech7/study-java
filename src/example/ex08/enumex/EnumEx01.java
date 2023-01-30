package example.ex08.enumex;

public class EnumEx01 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "SOUTH");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println();

        Direction[] dArr = Direction.values();
        for (Direction d : dArr) {
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
        }
    }

}
