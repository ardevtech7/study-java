package example.student;

public class Student {
    String name;
    int age;
    AfterSchool afterSchool;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 방과후 교실 정보 만드는 메서드
    public AfterSchool makeInfo(String name, int num) {
        AfterSchool afterSchool1 = new AfterSchool();
        afterSchool1.afterSchoolName = name;
        afterSchool1.afterSchoolNum = num;
        return afterSchool1;
    }

    public AfterSchool getAfterSchool() {
        return afterSchool;
    }

    public void setAfterSchool(AfterSchool afterSchool) {
        this.afterSchool = afterSchool;
    }
}
