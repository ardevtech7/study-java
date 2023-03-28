package example.ex05.generic.ex01;

public class CourseTest {
    public static void main(String[] args) {

        // Course 1 - 모든 사람 신청 가능
        Applicant<Student> studentApplicant = new Applicant<>(new Student());
        // 동일한 코드 방식
        Course.registerCourse1(studentApplicant);
        Course.registerCourse1(new Applicant<>(new Student()));

        Course.registerCourse1(new Applicant<>(new Worker()));
        Course.registerCourse1(new Applicant<>(new HighSchool()));

        // Course 2 - 학생만 등록 가능
        Course.registerCourse2(new Applicant<>(new Student()));
//        Course.registerCourse2(new Applicant<>(new Worker()));

    }
}
