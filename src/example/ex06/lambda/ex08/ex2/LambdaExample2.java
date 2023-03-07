package example.ex06.lambda.ex08.ex2;

public class LambdaExample2 {
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문이 두 개 이상인 경우 중괄호 필요
        person.action(() -> {
            System.out.println("출근을 합니다.");
            System.out.println("개발을 합니다.");
        });

        // 실행문이 한 개인 경우 중괄호 생략
        person.action(() -> System.out.println("퇴근합니다."));

    }
}
