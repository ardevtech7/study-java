package doit.ch11.equalhash;

class StudentV2 {
    int studentId;
    String studentName;

    public StudentV2(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StudentV2) {
            StudentV2 student =  (StudentV2) obj;
            if (this.studentId == student.studentId) { // 학번이 같은지 확인
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return studentId; // 해시 코드 값으로 학번을 반환하도록 메서드 재정의
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
public class EqualsTestV2 {
    public static void main(String[] args) {
        StudentV2 student = new StudentV2(100, "홍길동");
        StudentV2 student1 = student; // 주소값 복사
        StudentV2 student2 = new StudentV2(100, "홍길동");

        // Equals()
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

        // HashCode()
        // 두 인스턴스는 논리적으로 같기 때문에 같은 해시 코드 값을 반환
        System.out.println();
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        System.out.println();
        System.out.println(System.identityHashCode(student1));
        System.out.println(System.identityHashCode(student2));
    }
}
