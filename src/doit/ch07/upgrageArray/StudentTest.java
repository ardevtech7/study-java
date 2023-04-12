package doit.ch07.upgrageArray;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1001, "Lee");
        student1.addSubject("국어", 100);
        student1.addSubject("수학", 90);

        Student student2 = new Student(1001, "Kim");
        student2.addSubject("국어", 100);
        student2.addSubject("영어", 70);
        student2.addSubject("수학", 90);

        student1.showStudentInfo();
        System.out.println();
        student2.showStudentInfo();
    }
}
