package example.ex05.generic.enumex;

public enum Direction {
    EAST(1, ">"),
    SOUTH(2, "V"),
    WEST(3, "<"),
    NORTH(4, "^");

    private final int value;
    private final String symbol;
    private static final Direction[] DIR_ARR = Direction.values();

    Direction(int value, String symbol) { // private
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Direction of (int dir) {
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("Invalid value: " + dir);
        }
        return DIR_ARR[dir - 1];
    }
}
