package example.ex02.array02;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "ahram");
        student1.addSubject("수학", 90);
        student1.addSubject("국어", 100);

        student1.showStudentInfo();
    }

}
