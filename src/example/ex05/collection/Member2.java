//package example.ex05.collection;
//
//import java.util.Comparator;
//import java.util.Objects;
//
//public class Member2 implements Comparator<Member2> {
//    private int memberId;
//    private String memberName;
//
//    public Member2(int memberId, String memberName) {
//        this.memberId = memberId;
//        this.memberName = memberName;
//    }
//
//    public int getMemberId() {
//        return memberId;
//    }
//
//    public void setMemberId(int memberId) {
//        this.memberId = memberId;
//    }
//
//    public String getMemberName() {
//        return memberName;
//    }
//
//    public void setMemberName(String memberName) {
//        this.memberName = memberName;
//    }
//
//    @Override
//    public String toString() {
//        return "회원 아이디: " + memberId + ", 회원 이름: " + memberName;
//    }
//
//    @Override
//    public int compare(Member2 mem1, Member2 mem2) {
//        return mem1.getMemberId() - mem2.getMemberId();
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Member2 member = (Member2) o;
//        return memberId == member.memberId;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(memberId);
//    }
//
//    @Override
//    public int compareTo(Member2 member) {
////        return (this.memberId - member.memberId); // 오름차순
//        return (this.memberId - member.memberId) * (-1); // 내림차순
//    }
//}
