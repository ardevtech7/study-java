package example.ex02.singleton;

/*
    singleton 패턴으로 회사 클래스 구현하기
    - singleton 에서는 생성자를 반드시 명시하고, 그 접근 제어자를 private로 지정한다.
 */
public class Company {

    // 2. 클래스 내부에 static 으로 유일한 인스턴스 생성하기 -> 프로그램 전체에서 사용할 유일한 인스턴스
    private static Company instance = new Company();

    // 1. private 로 생성자 만들기 -> 외부 인스턴스 생성 X
    private Company() {

    }

    // 3. 외부에서 참조할 수 있는 public 메서드 만들기
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
