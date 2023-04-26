package doit.ch12.collection.treemap;

import doit.ch12.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();
        Member member = new Member(1, "a");
        Member member2 = new Member(2, "b");
        Member member3 = new Member(3, "c");

        memberHashMap.addMember(member);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);
        memberHashMap.showAllMember();

        memberHashMap.removeMember(member.getMemberId());
        memberHashMap.showAllMember();
    }
}
