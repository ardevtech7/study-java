package example.ex02.array02;

import java.util.ArrayList;

public class Student {
    int studentId;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String subjectName, int subjectScore) {
        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectScore(subjectScore);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for (Subject s : subjectList) {
            total += s.getSubjectScore();
            System.out.println(studentName + " 학생의 " + s.getSubjectName() + "과목의 성적은" + s.getSubjectScore() + " 입니다.");
        }

        System.out.println(studentName + " 학생의 총점은 " + total);
    }
}
