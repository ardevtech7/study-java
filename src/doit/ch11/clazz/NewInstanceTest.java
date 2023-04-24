package doit.ch11.clazz;

// newInstance() : 항상 Object 반환하므로 생성된 객체형으로 형 변환
public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person person = new Person();
        System.out.println(person);

        Class pClass = Class.forName("doit.ch11.clazz.Person");
        Person person1 = (Person) pClass.newInstance();
        System.out.println(person1);
    }
}
