package example.ex05.collection.hashset;

import example.ex05.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();
        Member member1 = new Member(1, "A");
        Member member2 = new Member(2, "B");
        Member member3 = new Member(3, "C");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);
        memberHashSet.showAllMember();

        Member member4 = new Member(3, "D");
        memberHashSet.addMember(member4);
        memberHashSet.showAllMember();

    }
}
