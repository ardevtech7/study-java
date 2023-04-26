package doit.ch12.collection;

public class Member implements Comparable<Member> {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId;
    }

    // 객체가 동일함을 구현
    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;

            // 매개변수로 받은 회원 아이디가 자신의 회원 아이디와 같다면 true 반환
            if (this.memberId == member.memberId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    // 오름차순, 내림차순
    @Override
    public int compareTo(Member member) {
        /*
            비교하는 두 값 중
            - this 값이 더 크면 양수 반환하여, 오름차순 정렬
            - this 값이 더 작으면 음수 반환하여, 내림차순 정렬
         */
        return (this.memberId - member.memberId); // 추가한 회원 아이디와 매개변수로 받은 회원 아이디를 비교
//        return (this.memberId - member.memberId) * -1;
    }

}
