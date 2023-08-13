package example.basic.basic01;

public class MutablePersonTest {
    public static void main(String[] args) {
        MutablePerson mutablePerson = new MutablePerson(20, "홍길동");
        mutablePerson.name = "김길동";
        System.out.println(mutablePerson);
    }
}
