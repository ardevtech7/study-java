package example.ex04.objectclass.ex03;

public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person person = new Person();
        System.out.println(person);

        Class pClass = Class.forName("example.ex04.objectclass.ex03.Person");
        Person person1 = (Person) pClass.newInstance();
        System.out.println(person1);
    }
}
