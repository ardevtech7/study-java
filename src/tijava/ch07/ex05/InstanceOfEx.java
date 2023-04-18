package tijava.ch07.ex05;

public class InstanceOfEx {
    // 메인 메소드에서 바로 호출하기 위해서 정적 메소드 선언
    public static void personInfo(Person person) {
        System.out.println("name : " + person.name);
        person.walk();

/*        // person 이 참조하는 객체가 Student 타입인지 확인
        if (person instanceof Student) {
            // Student 객체일 경우 강제 타입 변환
            Student student = (Student) person;

            // Student 객체만 가지고 있는 필드 및 메소드 사용
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }*/

        // 자바 12부터 사용 가능
        if (person instanceof Student student) {
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        // Person 객체를 매개값으로 제공하고 있는 personInfo() 메소드 호출
        Person person = new Person("홍길동");
        personInfo(person);
        System.out.println();

        Person person1 = new Student("김길동", 10);
        personInfo(person1);
    }
}
