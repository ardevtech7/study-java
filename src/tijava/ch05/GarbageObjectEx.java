package tijava.ch05;

public class GarbageObjectEx {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듦

        String kind1 = "자동차";
        String kind2 = kind1; // kind1 에 있는 번지를 kind2 변수에 대입
        kind1 = null; // "자동차" 에 해당하는 String 객체는 쓰레기가 아니다. 이유는 kind2 에서 참조하고 있기 때문이다.
        System.out.println(kind2);
    }
}
