package example.ex05.generic.enumex;

public class EnumEx02 {
    public static void main(String[] args) {
        for (Direction d : Direction.values()) {
            System.out.printf("%s=%d%n", d.name(), d.getValue());
        }

        Direction d1 = Direction.EAST;
        Direction d2 = Direction.of(2);

//        System.out.println(d1);
//        System.out.println(d2);
        System.out.println(d1.getSymbol());
        System.out.println(d1.getValue());
    }
}
