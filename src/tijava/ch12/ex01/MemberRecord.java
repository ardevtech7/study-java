package tijava.ch12.ex01;

/*
    레코드 소스를 컴파일하면,
    - 변수의 타입과 이름을 이용해서 private final 필드(읽기 전용)가 자동 생성
    - 생성자
    - Getter 메소드가 자동 추가
    - hashCode(), equal(), toString() 를 재정의한 코드도 자동 생성
 */
public record MemberRecord(String name, int age) {
}
