
package doit.ch07.upgrageArray;

import java.util.ArrayList;

// 복습용 코드
// ArrayList 를 사용해서 학생 성적 출력 - 정답
public class Student1 {
    private int studentId;
    private String studentName;
    private ArrayList<Subject> subjectList;

    // 생성자 매개변수는 id와 name 만 받고, ArrayList 는 생성만 담당
    public Student1(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjectList = new ArrayList<>();
    }

    // 과목 이름, 점수를 매개변수로 받아서 ArrayList 에 추가한다.
    public void addSubject(String subjectName, int score) {
        Subject subject = new Subject(subjectName, score);
        subjectList.add(subject);
    }

    // 과목 이름과 점수, 총점 출력
    public void printInfo() {
        int sum = 0;
        for (int i = 0; i < subjectList.size(); i++) {
            // 리스트에 하나씩 접근해서 Subject 를 가져온다.
            Subject subject = subjectList.get(i);
            sum += subject.getScore();
            System.out.println(studentName + "의 " + subject.getSubjectName() + " 과목 점수 : " + subject.getScore());
        }
        System.out.println("총점 : " + sum);
    }

    public static void main(String[] args) {
        Student1 student = new Student1(1, "홍길동");
        student.addSubject("국어", 90);
        student.addSubject("수학", 100);
        student.printInfo();
    }
}
