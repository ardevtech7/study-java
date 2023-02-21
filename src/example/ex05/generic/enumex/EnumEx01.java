package example.ex05.generic.enumex;

public class EnumEx01 {
    public static void main(String[] args) {
//        Direction d0 = new Direction(1); // 열거형 생성자는 외부에서 호출 불가
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "SOUTH");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println();

        Direction[] dArr = Direction.values();
        for (Direction d : dArr) {
            System.out.printf("%s=%d,%d%n", d.name(), d.getValue(), d.ordinal());
        }
    }
}
