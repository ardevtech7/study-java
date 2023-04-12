package example.ex01;

public class StudentTest {
    public static void main(String[] args) {
        /*
            static 변수 == 정적 변수 == 클래스 변수
            인스턴스마다 생성되는 변수가 아니라 클래스에 속해 한 번만 생성되는 변수이고, 이를 여러 인스턴스가 공유하기 때문에 클래스 변수라고도 한다.
         */

        System.out.println(Student.getSerialNum()); // 인스턴스 생성없이 호출 가능

        Student s1 = new Student("a");
        s1.setKorSubjectName("korea", 100);
        s1.setMathSubjectName("math", 200);
//        System.out.println(s1.serialNum);
//
//        s1.serialNum++;
//        System.out.println(s1.serialNum);
//
//        StudentForMe s2 = new StudentForMe("b");
//        System.out.println(s2.serialNum);

        System.out.println(s1.studentID);
        System.out.println(Student.getSerialNum());

        Student s2 = new Student("b");
        System.out.println(Student.getSerialNum());
    }
}
