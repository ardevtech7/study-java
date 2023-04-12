package doit.ch07.upgrageArray;

import java.util.ArrayList;

// ArrayList 를 사용해서 학생 성적 출력 - 정답
public class Student {
    private int studentId;
    private String studentName;
    private ArrayList<Subject> subjectList;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        subjectList = new ArrayList<>();
    }

    public void addSubject(String subjectName, int subjectScore) {
        Subject subject = new Subject(subjectName, subjectScore);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for (int i = 0; i < subjectList.size(); i++) {
            Subject subject = subjectList.get(i);
            total += subject.getScore();
            System.out.println(studentName + "의 " + subject.getSubjectName() + " 과목 성적 : " + subject.getScore());
        }
        System.out.println("총점 : " + total);
    }
}
