package doit.ch07.upgrageArray;

import doit.ch07.upgrageArray.StudentForMe;
import doit.ch07.upgrageArray.Subject;

import java.util.ArrayList;

public class StudentTestForMe {
    public static void main(String[] args) {
        StudentForMe student1 = new StudentForMe(1, "홍길동");

        ArrayList<Subject> studentSubject1 = new ArrayList<>();
        studentSubject1.add(new Subject("국어", 100));
        studentSubject1.add(new Subject("수학", 90));

        student1.setSubject(studentSubject1);

        //
        StudentForMe student2 = new StudentForMe(2, "이순신");

        ArrayList<Subject> studentSubject2 = new ArrayList<>();
        studentSubject2.add(new Subject("국어", 80));
        studentSubject2.add(new Subject("수학", 70));
        studentSubject2.add(new Subject("영어", 70));


        student2.setSubject(studentSubject2);

        //
        for (int i = 0; i < studentSubject1.size(); i++) {
            Subject subject = studentSubject1.get(i);
            String subjectName = subject.getSubjectName();
            int score = subject.getScore();
            System.out.println("학생 1의 " + subjectName + " 성적 : " + score);
        }

        System.out.println();
        //
        for (int i = 0; i < studentSubject2.size(); i++) {
            Subject subject = studentSubject2.get(i);
            String subjectName = subject.getSubjectName();
            int score = subject.getScore();
            System.out.println("학생 2의 " + subjectName + " 성적 : " + score);
        }
    }
}
