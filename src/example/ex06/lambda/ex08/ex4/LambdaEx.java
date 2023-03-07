package example.ex06.lambda.ex08.ex4;

public class LambdaEx {
    public static void main(String[] args) {
        // Example 1
        Person person = new Person();
        person.action1(((name, job) -> {
            System.out.print(name + "이 ");
            System.out.println(job + "을 합니다.");
        }));

        person.action1((name, job) ->
                System.out.println(name + "이" + job + "을 하지 않습니다."));

        person.action2(content -> System.out.println(content + " 이라고 말합니다."));

        // Example 2
        Workable workable = ((name, job) -> System.out.println(name + ", " + job));
        workable.work("홍길동", "프로그래머");

        Speakable speakable = (System.out::println);
        speakable.speak("HELLO");
    }

}
