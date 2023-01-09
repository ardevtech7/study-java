package example.ex01;

/*
    - 하나의 자바 파일 안에는 하나의 클래스를 두는 것이 원칙
    여러 개의 클래스가 같이 있는 겨우 public 클래스는 단 하나여야 한다.
    public 클래스와 자바 파일의 이름은 동일해야 한다.

    - String과 같은 참조형 변수는 기본 자료형과 같이 바로 사용할 수 있는게 있지만,
    그외 참조형 변수는 생성자를 구현해야 사용할 수 있다.
 */
public class Student {
    // static 변수 : 인스턴스를 생성할 때마다 만들어지는 것이 아니고, 클래스를 선언할 때 특정 메모리에 저장되어 모든 인스턴스가 공유하는 변수이다.
    private static int serialNum = 1000;

    // 인스턴스 변수 : 인스턴스가 생성될 때 만들어지는 것
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    // 참조 자료형
    private Subject korea;
    private Subject math;

    public Student(String name) {
        serialNum++; // 학생 인스턴스가 생성될 때마다 serialNum 값 증가
        studentID = serialNum; // 증가된 값을 학번 인스턴스 변수에 부여
        studentName = name;

        // 생성자 호출 시 참조 자료형 초기화
        korea = new Subject();
        math = new Subject();
    }

    // 국어 점수 가져오기
    public void setKorSubjectName(String subjectName, int subjectScore) {
        korea.subjectName = subjectName;
        korea.subjectScore = subjectScore;
    }

    // 수학 점수 가져오기
    public void setMathSubjectName(String subjectName, int subjectScore) {
        math.subjectName = subjectName;
        math.subjectScore = subjectScore;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }

    // 점수 출력
    public void showStudentInfo() {
        int total = korea.subjectScore + math.subjectScore;
        System.out.println("학번: " + studentID);
        System.out.println("이름: " + studentName);
        System.out.println("총점 : " + total);
    }

}
