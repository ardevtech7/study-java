package example.ex05.collection.treeset;

import example.ex05.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();
        Member member1 = new Member(1,"송중기");
        Member member2 = new Member(2, "박서준");
        Member member3 = new Member(3, "차은우");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);
        memberTreeSet.showAllMember();

        Member member4 = new Member(3, "홍길동");
        memberTreeSet.addMember(member4);
        memberTreeSet.showAllMember();

    }
}
