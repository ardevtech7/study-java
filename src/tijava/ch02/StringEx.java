package tijava.ch02;

public class StringEx {
    public static void main(String[] args) {
        // \ 이스케이프 문자에 사용
        String study = "나는 \"자바\"를 배웁니다.";
        System.out.println(study);

        String study2 = "나는 \'스프링\'을 배웁니다.";
        System.out.println(study2);

        String tab = "나는 탭\t탭\t사용합니다.";
        System.out.println(tab);

        String str0 = "" + // " 치고 엔터 누르면 자동으로 + 생김
                "{\n" +
                "\t\"id\" : \"winter\",\n" +
                "\t\"name\" : \"눈송이\"\n" +
                "}";
        System.out.println(str0);

        String str1 = """
                안녕하세요 
                """;
        System.out.println(str1);
    }
}
