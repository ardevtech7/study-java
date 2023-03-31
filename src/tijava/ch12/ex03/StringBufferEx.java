package tijava.ch12.ex03;

/*
    StringBuilder
    - 내부 버퍼(데이터를 저장하는 메모리)에 문자열을 저장해두고, 그 안에서 추가, 수정, 삭제
    - 따라서 String 처럼 새로운 객체를 생성하지 않고도 문자열 조작 가능
 */
public class StringBufferEx {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC") // ABCDEF
                .delete(3,4) // ABC D EF
                .toString();
        System.out.println(data);
    }
}
