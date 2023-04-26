package doit.ch12.collection.arraylist;

import doit.ch12.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(1, "홍길동");
        Member member2 = new Member(2, "김길동");
        Member member3 = new Member(3, "서길동");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
        memberArrayList.showAllMember();

//        memberArrayList.removeMemberV1(member1.getMemberId());
        memberArrayList.removeMemberV2(member1.getMemberId());
        memberArrayList.showAllMember();

        Member member5 = new Member(4, "박길동");
        memberArrayList.insertMember(member5, 1);
        memberArrayList.showAllMember();
    }
}
