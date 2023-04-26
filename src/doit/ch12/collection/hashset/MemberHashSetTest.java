package doit.ch12.collection.hashset;

import doit.ch12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();
        Member member1 = new Member(1, "홍길동");
        Member member2 = new Member(1, "김길동");
        Member member3 = new Member(2, "홍길동");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);

        memberHashSet.showAllMember();
    }
}
