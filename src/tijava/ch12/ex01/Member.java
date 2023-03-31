package tijava.ch12.ex01;

public class Member {
    private String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        // obj 가 Member 타입인지 검사하고, 타입 변환 후 target 변수에 대입
        if (obj instanceof Member target) {
            if (this.id.equals(target.id)) {
                return true;
            }
        }
        return false;
    }
}
