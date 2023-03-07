package example.ex06.stream.ex2;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String sex;
    private int score;

    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getScore() {
        return score;
    }


    @Override
    public String toString() {
        return "이름: " + name +
                ", " +
                "점수: " + score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);
    }
}
