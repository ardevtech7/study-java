package example.ex04.objectclass.ex01;

import example.ex04.objectclass.ex02.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "가");
        Student student2 = student1; // 주소 복사
        Student student3 = new Student(1, "가");

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));

        System.out.println(student1 == student3);
        System.out.println(student1.equals(student3));

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        System.out.println("student1의 실제 주소값: " + System.identityHashCode(student1));
        System.out.println("student3의 실제 주소값: " + System.identityHashCode(student3));

        // String, Integer
//        String s1 = new String("가나다");
//        String s2 = new String("가나다");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//
//        Integer i1 = new Integer(100);
//        Integer i2 = new Integer(100);
//        System.out.println(i1 == i2);
//        System.out.println(i1.equals(i2));
//        System.out.println(i1.hashCode());
//        System.out.println(i2.hashCode());
    }
}
