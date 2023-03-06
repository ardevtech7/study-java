package example.ex02.enum01;

public enum Rainbow {
    RED("빨강",10),
    ORANGE("오렌지", 20),
    YELLOW("노랑", 30);

    private final String color;
    private final int num;

    Rainbow(String color, int num) {
        this.color = color;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public int getNum() {
        return num;
    }
}
