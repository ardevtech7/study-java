package tijava.ch07.ex06;

public class SmartPhone extends Phone {
    public SmartPhone(String owner) {
        // Phone 생성자 호출
        super(owner);
    }

    void internetSearch() {
        System.out.println("검색");
    }
}
