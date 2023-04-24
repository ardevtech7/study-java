package doit.ch11.equalhash;

class StudentV1 {
    int studentId;
    String studentName;

    public StudentV1(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
public class EqualsTestV1 {
    public static void main(String[] args) {
        StudentV1 student = new StudentV1(100, "홍길동");
        StudentV1 student1 = student; // 주소값 복사
        StudentV1 student2 = new StudentV1(100, "홍길동");

        if (student == student1) {
            System.out.println("주소값이 같음");
        } else {
            System.out.println("주소값이 다름");
        }

        if (student.equals(student1)) {
            System.out.println("인스턴스 같음");
        } else {
            System.out.println("인스턴스 다름");
        }

        System.out.println();
        if (student1 == student2) {
            System.out.println("주소값이 같음");
        } else {
            System.out.println("주소값이 다름");
        }

        if (student1.equals(student2)) {
            System.out.println("인스턴스 같음");
        } else {
            System.out.println("인스턴스 다름");
        }
    }
}
