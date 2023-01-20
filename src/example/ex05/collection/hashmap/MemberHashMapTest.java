package example.ex05.collection.hashmap;

import example.ex05.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 = new Member(1,"송중기");
        Member member2 = new Member(2, "박서준");
        Member member3 = new Member(3, "차은우");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);
        memberHashMap.showAllMember();

        memberHashMap.removeMember(3);
        memberHashMap.showAllMember();
    }
}
