package tijava.ch12.ex01;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    // Object 의 hashCode() 재정의해서 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴
    // 번호와 이름이 같으면 동일한 해시코드가 생성됨
    // hashCode() 재정의하지 않으면, 객체 번지로 해시코드를 생성하므로 객체가 다를 경우 해시코드도 달라진다.
    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        System.out.println(hashCode);
        return hashCode;
    }

    // Object 의 equals() 재정의해서 Student 객체인지 확인, 학생 번호와 이름이 같으면 true 리턴
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student target) {
            if (no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
        }
        return false;
    }
}
