package example.basic.basic01;

public class MutablePerson {
    public int age;
    public String name;

    public MutablePerson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MutablePerson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
