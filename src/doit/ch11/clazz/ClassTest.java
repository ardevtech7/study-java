package doit.ch11.clazz;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class pClass1 = person.getClass(); // Object 의 getClass() 메서드 사용
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class; // 직접 class 파일 대입
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("doit.ch11.clazz.Person"); // 클래스 이름으로 가져오기
        System.out.println(pClass3);

    }
}
