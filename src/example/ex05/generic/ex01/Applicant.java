package example.ex05.generic.ex01;

public class Applicant <T> {
    public T kind;

    public Applicant(T kind) {
        this.kind = kind;
    }
}
