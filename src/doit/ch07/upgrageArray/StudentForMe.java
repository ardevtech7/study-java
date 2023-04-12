package doit.ch07.upgrageArray;

import java.util.ArrayList;

// ArrayList 를 사용해서 학생 성적 출력
public class StudentForMe {
    private int id;
    private String name;
    private ArrayList<Subject> subject;

    public StudentForMe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Subject>  getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<Subject>  subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "StudentForMe{" +
                "id=" + id +
                ", name=" + name +
                ", subject=" + subject +
                '}';
    }
}
