package example.basic.basic01;

public class ImmutablePerson {
    private final int age;
    private final String name;

    public ImmutablePerson(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
