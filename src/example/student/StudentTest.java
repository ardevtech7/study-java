package example.student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 10);

        String afterSchoolName = "종이접기";
        int afterSchoolNum = 10;
        AfterSchool afterSchool = student.makeInfo(afterSchoolName, afterSchoolNum);

        student.setAfterSchool(afterSchool);
        System.out.println(student.getAfterSchool());
    }
}
