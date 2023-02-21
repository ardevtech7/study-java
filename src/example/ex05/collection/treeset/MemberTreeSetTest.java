package example.ex05.collection.treeset;

import example.ex05.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();
        memberTreeSet.addMember(new Member(1,"송중기"));
        memberTreeSet.addMember(new Member(2, "박서준"));
        memberTreeSet.addMember(new Member(3, "차은우"));
        memberTreeSet.showAllMember();

        // id 중복
        memberTreeSet.addMember(new Member(3, "홍길동"));
        memberTreeSet.showAllMember();

    }
}
