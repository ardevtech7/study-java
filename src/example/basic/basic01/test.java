package example.basic.basic01;

public class test {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "홍길동"; // error
        student.age = 20;

        student.setName("홍길동");
        String name = student.getName();
        System.out.println(name);
    }
}
